package com.externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class User implements Externalizable{
	
	private int id;
	private String name;
	private String password;
	private String role;
	
	public User() {}
	
	public User(int id, String name, String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		id = in.readInt();
		name = (String) in.readObject();
		password = (String) in.readObject();
		role = (String) in.readObject();
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(id);
		out.writeObject(name);
		out.writeObject(password);
		out.writeObject(role);
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

public class DemoOnExternalization {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("externalization.ser"));
		User user = new User(1, "divya", "123456", "ADMIN");
		oos.writeObject(user);
		System.out.println(user);
		oos.flush();
		
		//de-ser
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("externalization.ser"));
		User user2 = (User) ois.readObject();
		System.out.println(user2);
	}

}
