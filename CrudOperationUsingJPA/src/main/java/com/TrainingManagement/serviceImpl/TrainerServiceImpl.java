package com.TrainingManagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TrainingManagement.Repository.TrainerRepository;
import com.TrainingManagement.models.Trainer;
import com.TrainingManagement.models.Vendor;
import com.TrainingManagement.service.TrainerService;


@Service
@Transactional
public class TrainerServiceImpl implements TrainerService {

	
	@Autowired
	TrainerRepository trainerRepository;
	
	
	@Override
	public Trainer createTrainer(Trainer trainer) {
		
		return trainerRepository.save(trainer);
	}

	@Override
	public Trainer updateTrainer(Trainer trainer) {
		 Optional < Trainer > trainerDb = this.trainerRepository.findById(trainer.getTrainerId());
		 
		 Vendor vendor=null;
		 Trainer trainerUpdate=trainerDb.get();
		 trainerUpdate.setTrainerId(trainer.getTrainerId());
		 trainerUpdate.setTrainerName(trainer.getTrainerName());
		  trainerUpdate.setVendor(vendor);
		  trainerUpdate.setSkillSet(trainer.getSkillSet());
		  trainerUpdate.setCategory(trainer.getCategory());
		  trainerRepository.save(trainerUpdate);
		  return trainerUpdate;
	}

	@Override
	public List<Trainer> getAllTrainer() {
		 return (List<Trainer>) this.trainerRepository.findAll();
	}

	@Override
	public Trainer getTrainerById(int trainerId) {
		 Optional < Trainer > trainerDb = this.trainerRepository.findById(trainerId);

		  
         return trainerDb.get();
	}

	@Override
	public void deleteTrainer(int trainerId) {
		 Optional < Trainer > trainerDb = this.trainerRepository.findById(trainerId);
		 trainerRepository.delete(trainerDb.get());
		
	}

}
