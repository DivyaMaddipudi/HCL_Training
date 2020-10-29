package com.customize_ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	
	private int id;
	private String name;
	private String password;
	private String role;
	
	//de - ser process
	//private: as we dont want to expose thesse methods to the client
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		this.password = password.substring(5, password.length());
		System.out.println("private Object readObject(ObjectInputStream ois)");
	}

	//ser process
	private void writeObject(ObjectOutputStream oos) throws IOException {
		//logic to do password hashing MD5, BCryptpass encoder..
		String encodedPassword = "%$#@$" + this.password;
		this.password = encodedPassword;
		oos.defaultWriteObject();
		System.out.println("private void writeObject(ObjectOutputStream oos)");
	}

	public User() {
		
	}
	public User(int id, String name, String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", password=");
		builder.append(password);
		builder.append(", role=");
		builder.append(role);
		builder.append("]");
		return builder.toString();
	}
}

public class DemoCustomizeSer {
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser_user.ser"));
			User user = new User(1, "satya", "satya@123", "ADMIN");
			oos.writeObject(user);
			System.out.println(user.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ser_user.ser"));
			User user1 = (User) ois.readObject();
			System.out.println(user1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
