package com.TrainingManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Training {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "training_id")
	private int trainingId;
	
	@Column(name = "training_name")
	private String trainerName;
	
	@Column(name = "from_date")
	private String fromDate;
	
	@Column(name = "to_date")
	private String toDate;
	
	@Column(name = "venue")
	private String venue;
	
	@Column(name = "total_sessions")
	private int totalSessions;
	
	@Column(name = "total_seats")
	private int totalSeats;

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public int getTotalSessions() {
		return totalSessions;
	}

	public void setTotalSessions(int totalSessions) {
		this.totalSessions = totalSessions;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Training(int trainingId, String trainerName, String fromDate, String toDate, String venue, int totalSessions,
			int totalSeats) {
		super();
		this.trainingId = trainingId;
		this.trainerName = trainerName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.venue = venue;
		this.totalSessions = totalSessions;
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", trainerName=" + trainerName + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", venue=" + venue + ", totalSessions=" + totalSessions + ", totalSeats="
				+ totalSeats + "]";
	}

}
