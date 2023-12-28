package com.JPAProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.JPAProject.entities.Employee;
import com.JPAProject.service.EmployService;

@SpringBootApplication
public class JpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}
	
	@Bean
	CommandLineRunner testBackend(EmployService empService) {
		
		Employee newEmp = new Employee();
		newEmp.setEmpName("chiranjeevi");
		newEmp.setEmpAdd("TS");
		newEmp.setEmpNo(0);
		newEmp.setSalary("50,00,000");
		newEmp.setEmpPhone("1234567890");
		
		empService.add(newEmp);
		
		return null;
		
	}

}
