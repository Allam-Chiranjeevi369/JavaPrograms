package com.springProject.employManagement.model;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAddress=" + empAddress + ", empPhone="
				+ empPhone + ", salary=" + salary + ", getEmpNo()=" + getEmpNo() + ", getEmpName()=" + getEmpName()
				+ ", getEmpAddress()=" + getEmpAddress() + ", getEmpPhone()=" + getEmpPhone() + ", getSalary()="
				+ getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private int empNo ;
	private String empName;
	private String empAddress;
	private String empPhone;
	private String salary;
	
	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, String empAddress, String empPhone, String salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.empAddress = empAddress;
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

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
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
