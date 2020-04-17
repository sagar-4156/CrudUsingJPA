package com.TrainingManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TrainingManagement.models.Trainer;
import com.TrainingManagement.models.Vendor;
import com.TrainingManagement.service.TrainerService;
import com.TrainingManagement.service.VendorService;

@RestController
public class TrainerController {
	
	
	@Autowired
	TrainerService trainerService;
	
	 @GetMapping("/trainers")
	    public ResponseEntity<List<Trainer>> getAllTrainer() {
	        return ResponseEntity.ok().body(trainerService.getAllTrainer());
	    }

	    @GetMapping("/trainers/{trainerId}")
	    public ResponseEntity < Trainer > getTrainerById(@PathVariable int trainerId) {
	        return ResponseEntity.ok().body(trainerService.getTrainerById(trainerId));
	    }
	    @PostMapping("/trainers")
	    public ResponseEntity <Trainer > createTrainer(@RequestBody Trainer trainer) {
	        return ResponseEntity.ok().body(this.trainerService.createTrainer(trainer));
	    }

	    @PutMapping("/trainers/{trainerId}")
	    public ResponseEntity < Trainer > updateTrainer(@PathVariable int trainerId, @RequestBody Trainer trainer ) {
	    	trainer.setTrainerId(trainerId);
	       
	        return ResponseEntity.ok().body(this.trainerService.updateTrainer(trainer));
	    }

	    @DeleteMapping("/trainers/{trainerId}")
	    public HttpStatus deleteProduct(@PathVariable int trainerId) {
	       this.trainerService.deleteTrainer(trainerId);;
	        return HttpStatus.OK;
	    }

}
