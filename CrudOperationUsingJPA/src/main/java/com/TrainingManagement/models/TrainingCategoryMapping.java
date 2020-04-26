package com.TrainingManagement.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class TrainingCategoryMapping implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name="training_id")
	private Training training;
	
	@OneToOne
	@JoinColumn(name="category_id")
	private Category category;

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public TrainingCategoryMapping(Training training, Category category) {
		super();
		this.training = training;
		this.category = category;
	}

	@Override
	public String toString() {
		return "TrainingCategoryMapping [training=" + training + ", category=" + category + "]";
	}

}
