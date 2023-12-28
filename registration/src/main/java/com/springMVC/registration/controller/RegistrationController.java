package com.springMVC.registration.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;


//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springMVC.registration.model.Register;
import com.springMVC.registration.serviceImpl.RegistrationServiceImpl;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationServiceImpl regService;
	
	@GetMapping("/registration") // Just for displaying......
	public String displayForm(Model model) {
		
		Register reg = new Register();
		model.addAttribute("register", reg);
		return "registerForm";

	}

	@PostMapping("/submitForm")
	public String registered(@Valid Register register,BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			return "registerForm";
			
		}
		regService.addRegistration(register);
		System.out.println("Registered details : " + register);
		model.addAttribute("msg", "Successfully registered!");
		return "registeredDetails";
		
	}

}
