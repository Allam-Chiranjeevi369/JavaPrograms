package com.springMVC.registration.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.registration.model.Register;
import com.springMVC.registration.repo.RegistrationRepository;
import com.springMVC.registration.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	
	@Autowired
	RegistrationRepository regRepo;

	@Override
	public String addRegistration(Register register) {
		regRepo.save(register);
		return "New registration added";
	}

}
