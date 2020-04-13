package com.TrainingManagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TrainingManagement.Repository.VendorRepository;
import com.TrainingManagement.models.Vendor;
import com.TrainingManagement.service.VendorService;


@Service
@Transactional
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	VendorRepository vendorrepository;

	@Override
	public Vendor createVendor(Vendor vendor) {
		return vendorrepository.save(vendor);
		
	}
	

	@Override
	public Vendor updateVendor(Vendor vendor) {
		  Optional < Vendor > vendorDb = this.vendorrepository.findById(vendor.getVendorId());
		 
			  Vendor vendorUpdate=vendorDb.get();
			  vendorUpdate.setVendorId(vendor.getVendorId());
			  vendorUpdate.setVendorName(vendor.getVendorName());
			  vendorrepository.save(vendorUpdate);
			  return vendorUpdate;
		 
	}

	@Override
	public List<Vendor> getAllVendor() {
		 return (List<Vendor>) this.vendorrepository.findAll();
	}

	@Override
	public Vendor getVendorById(int vendorId) {
		 Optional < Vendor > vendorDb = this.vendorrepository.findById(vendorId);

	  
	            return vendorDb.get();
	        
	}

	@Override
	public void deleteVendor(int vendorId) {
		 Optional < Vendor > vendorDb = this.vendorrepository.findById(vendorId);
		 
		 vendorrepository.delete(vendorDb.get());
		
	}

}
