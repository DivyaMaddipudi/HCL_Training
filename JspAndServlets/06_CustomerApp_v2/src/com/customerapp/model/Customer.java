package com.customerapp.model;

import java.util.Date;

public class Customer {
	
	private int id;
	private String name;
	private String address;
	private String email;
	private String phone;
	private Date dob;
	private int purchaseCapacity;
	
	public Customer(int id, String name, String address, String email, String phone, Date dob, int purchaseCapacity) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.purchaseCapacity = purchaseCapacity;
	}
	public Customer(String name, String address, String email, String phone, Date dob, int purchaseCapacity) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.purchaseCapacity = purchaseCapacity;
	}
	
	
	public Customer(String address, String email, String phone, int purchaseCapacity) {
		super();
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.purchaseCapacity = purchaseCapacity;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getPurchaseCapacity() {
		return purchaseCapacity;
	}
	public void setPurchaseCapacity(int purchaseCapacity) {
		this.purchaseCapacity = purchaseCapacity;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", purchaseCapacity=");
		builder.append(purchaseCapacity);
		builder.append("]");
		return builder.toString();
	}

}
