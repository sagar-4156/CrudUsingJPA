package com.TrainingManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trainer_id")
	private int trainerId;
	
	@Column(nullable = false, name = "trainer_name")
	private String trainerName;
	
	@Column(nullable = false, name = "category")
	private String category;
	
	@ManyToOne
	@JoinColumn(name = "vendor_id")
	private Vendor vendor;
	
	@Column(nullable = false, name = "skill_set")
	private String skillSet;

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public Trainer(int trainerId, String trainerName, String category, Vendor vendor, String skillSet) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.category = category;
		this.vendor = vendor;
		this.skillSet = skillSet;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", category=" + category
				+ ", vendor=" + vendor + ", skillSet=" + skillSet + "]";
	}

}
