package com.example.EmployeeProjectWithDatabase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	
	@Column(name = "empname")
	private String empname;
	
	@Column(name = "empsalary")
	private float empsalary;
	
	@Column(name = "empcompany")
	private String empcompany;
	
	public Employee() {}
	
	public Employee(int empid, String empname, float empsalary, String empcompany) {
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empcompany = empcompany;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpcompany() {
		return empcompany;
	}
	public void setEmpcompmany(String empcompmany) {
		this.empcompany = empcompmany;
	}
	
	
}
