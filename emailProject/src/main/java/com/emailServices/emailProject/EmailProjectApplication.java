package com.emailServices.emailProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.emailServices.emailProject.model.Email;
import com.emailServices.emailProject.service.EmailService;

@SpringBootApplication
@Component
public class EmailProjectApplication implements CommandLineRunner{
	
	private EmailService emailService;
	private Email email;
	
	public EmailProjectApplication(EmailService emailService, Email email) {
		super();
		this.emailService = emailService;
		this.email = email;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmailProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		email.setFrom("a.chiranjeevi2002@gmail.com");
		email.setTo("a.chiranjeevi2002@gmail.com");
		email.setSubject("Testing");
		email.setText("Email service testing...");
		emailService.sendMail(email);
		
	}

}
