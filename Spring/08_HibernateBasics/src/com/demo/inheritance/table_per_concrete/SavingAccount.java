package com.demo.inheritance.table_per_concrete;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("SA")
public class SavingAccount extends Account{
	
	@Column(nullable = false)
	private double interestRate;

	public SavingAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("SavingAccount [interestRate=");
		builder.append(interestRate);
		builder.append("]");
		
		return builder.toString();
	}

	public SavingAccount() {
	}

	public SavingAccount(String name, double balance) {
		super(name, balance);
	}
	
}
