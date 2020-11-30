package com.customerapp.model.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "customer_details")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	private String customerName;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date birthDay;
	
	private String phoneNum;
	private String address;
	
	public Customer() {
	}

	public Customer(String customerName, Date birthDay, String phoneNum, String address) {
		this.customerName = customerName;
		this.birthDay = birthDay;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerId=");
		builder.append(customerId);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", birthDay=");
		builder.append(birthDay);
		builder.append(", phoneNum=");
		builder.append(phoneNum);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}
