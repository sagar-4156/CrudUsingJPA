package com.TrainingManagement.Repository;

import java.util.List;

import com.TrainingManagement.models.Trainer;

public interface TrainerDao {

	void saveTrainer(Trainer trainer);

	void updateTrainer(Trainer trainer);

	Trainer getTrainerById(int trainerId);

	List<Trainer> getAllTrainer();

	void deleteTrainer(int trainerId);

}
