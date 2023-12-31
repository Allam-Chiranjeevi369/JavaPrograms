package com.JPAProject.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.JPAProject.entities.Employee;
import com.JPAProject.repository.EmployRepo;


@Service
public class EmployService {
	
	@Autowired
	EmployRepo empRepo;
	
	public String add(Employee employee) {
		
		empRepo.save(employee);
		return "New employee added";
		
	}
	

}
