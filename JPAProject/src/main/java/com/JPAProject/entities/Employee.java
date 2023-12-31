package com.JPAProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private int empNo;
	
	private String empName = null;
	private String empAdd = null;
	private String empPhone = null;
	private String salary = null;
	
	public Employee() {
		super();
	}
	
	public Employee(int empNo, String empName, String empAdd, String empPhone, String salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empPhone = empPhone;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
