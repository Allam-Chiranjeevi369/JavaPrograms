package com.springProject.employManagement;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springProject.employManagement.model.Employee;
import com.springProject.employManagement.service.EmployeeService;

@SpringBootApplication
public class EmployManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployManagementApplication.class, args);
		
		Employee employee = new Employee(122,"chiru","Hyd", "1234567890","50,00,000");
		
		EmployeeService employeeService = new EmployeeService();
		employeeService.add(employee);
		
	}

}
