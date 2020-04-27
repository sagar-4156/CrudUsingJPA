package com.TrainingManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(name = "emp_id")
	private int empId;

	@Column(nullable = false, name = "emp_name")
	private String empName;

	@Column(name = "password", nullable = false)
	private String password;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int empId, String empName, String password) {
		super();
		this.empId = empId;
		this.empName = empName;

		this.password = password;
	}

	public User() {

	}

	@Override
	public String toString() {
		return "User [empId=" + empId + ", empName=" + empName + ", password=" + password + "]";
	}

}
