package com.TrainingManagement.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {
	
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(nullable=false,name="emp_name")
	private String empName;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
	private  Role role;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
	private Department department;
	

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
	private Project project;
	
	@Column(name="password")
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int empId, String empName, Role role, Department department, Project project, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.role = role;
		this.department = department;
		this.project = project;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [empId=" + empId + ", empName=" + empName + ", role=" + role + ", department=" + department
				+ ", project=" + project + ", password=" + password + "]";
	}


	
	
	

}
