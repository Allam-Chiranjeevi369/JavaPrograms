package com.emailServices.emailProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class SimpleMailMsgConfig {
	
	@Bean
	SimpleMailMessage message() {
		
		return new SimpleMailMessage();
		
	}

}
