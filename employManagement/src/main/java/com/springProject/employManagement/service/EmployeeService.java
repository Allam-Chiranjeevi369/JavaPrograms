package com.springProject.employManagement.service;

import com.springProject.employManagement.model.Employee;
import com.springProject.employeeManagement.dao.EmployeeInterface;
import com.springProject.employeeManagement.daoImpl.EmployeeInterfaceImpl;

public class EmployeeService {
	
	public EmployeeService() {
		
	}
	
	public void add(Employee employee) {
		
		EmployeeInterface empInterface = new EmployeeInterfaceImpl();
		empInterface.add(employee);
		
	}
	
	public void update() {
		
	}
	
	public void remove() {
		
	}
	
}
