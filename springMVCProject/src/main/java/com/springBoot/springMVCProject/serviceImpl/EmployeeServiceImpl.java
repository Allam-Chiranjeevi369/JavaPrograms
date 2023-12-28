package com.springBoot.springMVCProject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springBoot.springMVCProject.entities.Employee;
import com.springBoot.springMVCProject.repository.EmployeeRepository;
import com.springBoot.springMVCProject.service.EmployeeServiceInterface;

public class EmployeeServiceImpl implements EmployeeServiceInterface {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	Employee emp;
	
	@Override
	public String getRecord() {
		empRepo.getById(emp.getEmpNo());
		return null;
	}

}
