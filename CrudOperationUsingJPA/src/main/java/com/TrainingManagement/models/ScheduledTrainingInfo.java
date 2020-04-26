package com.TrainingManagement.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ScheduledTrainingInfo implements Serializable{
	
	@Id
	@OneToOne
	@JoinColumn(name="training_id")
	private Training training;
	
	
	@Column(name="total_seats",nullable=false)
	private int totalSeats;
	
	@Column(name="availableSeats",nullable=false)
	private int availableSeats;

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public ScheduledTrainingInfo(Training training, int totalSeats, int availableSeats) {
		super();
		this.training = training;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "ScheduledTrainingInfo [training=" + training + ", totalSeats=" + totalSeats + ", availableSeats="
				+ availableSeats + "]";
	}
	

}
