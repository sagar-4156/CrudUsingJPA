package com.TrainingManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeROMapping {
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private User user;
	
	@Id
	@Column(nullable = false, name = "ro_id")
	private int roId;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getRoId() {
		return roId;
	}

	public void setRoId(int roId) {
		this.roId = roId;
	}

	public EmployeeROMapping(User user, int roId) {
		super();
		this.user = user;
		this.roId = roId;
	}

	@Override
	public String toString() {
		return "EmployeeROMapping [user=" + user + ", roId=" + roId + "]";
	}

}
