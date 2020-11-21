package com.bankapp.model.service;

import org.springframework.stereotype.Service;

//@Service
public class EmailServiceImpl implements EmailService{

	public void sendEmail(String email) {
		System.out.println("email is send...." + email);
		
	}

}
