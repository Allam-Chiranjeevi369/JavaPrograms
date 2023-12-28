package com.emailServices.emailProject.serviceImpl;

//import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.emailServices.emailProject.model.Email;
import com.emailServices.emailProject.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
	
	private JavaMailSender javaMailSend;
	
	private SimpleMailMessage message;
	
	public EmailServiceImpl(JavaMailSender javaMailSend, SimpleMailMessage message) {
		this.javaMailSend = javaMailSend;
		this.message = message;
	}
	
	@Override
	public void sendMail(Email email) {
	
		message.setFrom(email.getFrom());
		message.setTo(email.getTo());
		message.setSubject(email.getSubject());
		message.setText(email.getText());
		
		javaMailSend.send(message);

	}

}