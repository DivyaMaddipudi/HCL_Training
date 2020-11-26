package com.demo.inheritance.singhe_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.print.attribute.standard.MediaSize.NA;

@Entity
//@DiscriminatorValue("CA")
public class CurrentAccount extends Account{
	
	@Column(nullable = false)
	private double overDraft;

	public CurrentAccount(String name, double balance, double overDraft) {
		super(name, balance);
		this.overDraft = overDraft;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("CurrentAccount [overDraft=");
		builder.append(overDraft);
		builder.append("]");
		return builder.toString();
	}

	public CurrentAccount() {
	}

	public CurrentAccount(String name, double balance) {
		super(name, balance);
	}


	
	
}
