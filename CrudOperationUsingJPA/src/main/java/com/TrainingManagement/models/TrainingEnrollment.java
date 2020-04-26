package com.TrainingManagement.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class TrainingEnrollment implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name = "emp_id")
	private User user;

	@OneToOne
	@JoinColumn(name = "training_id")
	private Training training;
	@Column(name = "is_approved", nullable = false)
	private String isApproved;
	@Column(name = "is_attended", nullable = false)
	private String isAttended;

	@Column(name = "sessions_attended", nullable = false)
	private int sessionsAttended;

	@Column(name = "completion_status", nullable = false)
	private String completionStatus;

	@Column(name = "feedback", nullable = false)
	private String feedback;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public String getIsAttended() {
		return isAttended;
	}

	public void setIsAttended(String isAttended) {
		this.isAttended = isAttended;
	}

	public int getSessionsAttended() {
		return sessionsAttended;
	}

	public void setSessionsAttended(int sessionsAttended) {
		this.sessionsAttended = sessionsAttended;
	}

	public String getCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(String completionStatus) {
		this.completionStatus = completionStatus;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public TrainingEnrollment(User user, Training training, String isApproved, String isAttended, int sessionsAttended,
			String completionStatus, String feedback) {
		super();
		this.user = user;
		this.training = training;
		this.isApproved = isApproved;
		this.isAttended = isAttended;
		this.sessionsAttended = sessionsAttended;
		this.completionStatus = completionStatus;
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "TrainingEnrollment [user=" + user + ", training=" + training + ", isApproved=" + isApproved
				+ ", isAttended=" + isAttended + ", sessionsAttended=" + sessionsAttended + ", completionStatus="
				+ completionStatus + ", feedback=" + feedback + "]";
	}

}
