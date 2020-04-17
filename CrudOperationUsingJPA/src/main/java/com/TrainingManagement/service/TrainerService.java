package com.TrainingManagement.service;

import java.util.List;

import com.TrainingManagement.models.Trainer;

public interface TrainerService {
	
	Trainer createTrainer(Trainer trainer);
	Trainer updateTrainer(Trainer trainer);
	List<Trainer> getAllTrainer();
	Trainer getTrainerById(int trainerId);
	void deleteTrainer(int trainerId);

}
