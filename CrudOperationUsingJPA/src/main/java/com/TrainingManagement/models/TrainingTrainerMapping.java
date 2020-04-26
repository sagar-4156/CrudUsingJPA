package com.TrainingManagement.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TrainingTrainerMapping implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name="training_id")
	private Training training;
	
	@OneToOne
	@JoinColumn(name="trainer_id")
	private Trainer trainer;

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public TrainingTrainerMapping(Training training, Trainer trainer) {
		super();
		this.training = training;
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "TrainingTrainerMapping [training=" + training + ", trainer=" + trainer + "]";
	}

}
