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

import com.TrainingManagement.models.Vendor;
import com.TrainingManagement.service.VendorService;

@RestController
public class VendorController {
	
	
	@Autowired
	VendorService vendorService;
	
	 @GetMapping("/vendors")
	    public ResponseEntity < List < Vendor >> getAllVendor() {
	        return ResponseEntity.ok().body(vendorService.getAllVendor());
	    }

	    @GetMapping("/vendors/{vendorId}")
	    public ResponseEntity < Vendor > getProductById(@PathVariable int vendorId) {
	        return ResponseEntity.ok().body(vendorService.getVendorById(vendorId));
	    }
	    @PostMapping("/vendors")
	    public ResponseEntity < Vendor > createProduct(@RequestBody Vendor vendor) {
	        return ResponseEntity.ok().body(this.vendorService.createVendor(vendor));
	    }

	    @PutMapping("/vendors/{vendorId}")
	    public ResponseEntity < Vendor > updateProduct(@PathVariable int vendorId, @RequestBody Vendor vendor) {
	        vendor.setVendorId(vendorId);
	        return ResponseEntity.ok().body(this.vendorService.updateVendor(vendor));
	    }

	    @DeleteMapping("/vendors/{vendorId}")
	    public HttpStatus deleteVendor(@PathVariable int vendorId) {
	        this.vendorService.deleteVendor(vendorId);
	        return HttpStatus.OK;
	    }


}
