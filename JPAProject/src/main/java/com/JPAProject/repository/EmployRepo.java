package com.JPAProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPAProject.entities.Employee;

public interface EmployRepo extends JpaRepository<Employee, Integer> {
	
	
	
}
