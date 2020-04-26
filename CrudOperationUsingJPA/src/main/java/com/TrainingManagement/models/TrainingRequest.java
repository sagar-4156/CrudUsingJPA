package com.TrainingManagement.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class TrainingRequest implements Serializable{
	@Id
	@OneToOne
	@JoinColumn(name = "empId",referencedColumnName="emp_id", insertable = false, updatable = false)
	private User user;
	
	@Column( name = "training_name")
	private String trainingName;
	
	@Column(nullable = false, name = "target_comp_date")
	private String targetCompDate;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "deptId",referencedColumnName="dept_id",insertable = false, updatable = false)
	private Department department;

	@Column(nullable = false, name = "approval_status")
	private String approvalStatus;
	@Column(nullable = false, name = "is_approval_reqd")
	private String isapprovalRequired;

	@Column(nullable = false, name = "approver_id")
	private int approverId;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getTargetCompDate() {
		return targetCompDate;
	}

	public void setTargetCompDate(String targetCompDate) {
		this.targetCompDate = targetCompDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getIsapprovalRequired() {
		return isapprovalRequired;
	}

	public void setIsapprovalRequired(String isapprovalRequired) {
		this.isapprovalRequired = isapprovalRequired;
	}

	public int getApproverId() {
		return approverId;
	}

	public void setApproverId(int approverId) {
		this.approverId = approverId;
	}

	public TrainingRequest(User user, String trainingName, String targetCompDate, Department department,
			String approvalStatus, String isapprovalRequired, int approverId) {
		super();
		this.user = user;
		this.trainingName = trainingName;
		this.targetCompDate = targetCompDate;
		this.department = department;
		this.approvalStatus = approvalStatus;
		this.isapprovalRequired = isapprovalRequired;
		this.approverId = approverId;
	}

	@Override
	public String toString() {
		return "TrainingRequest [user=" + user + ", trainingName=" + trainingName + ", targetCompDate=" + targetCompDate
				+ ", department=" + department + ", approvalStatus=" + approvalStatus + ", isapprovalRequired="
				+ isapprovalRequired + ", approverId=" + approverId + "]";
	}

}
