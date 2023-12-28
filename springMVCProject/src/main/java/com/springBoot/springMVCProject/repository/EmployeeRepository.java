package com.springBoot.springMVCProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.springMVCProject.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
