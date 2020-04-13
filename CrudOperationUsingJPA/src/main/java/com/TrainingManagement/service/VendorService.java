package com.TrainingManagement.service;

import java.util.List;

import com.TrainingManagement.models.Vendor;

public interface VendorService 
{
	Vendor createVendor(Vendor vendor);

   Vendor updateVendor( Vendor  vendor);

    List <  Vendor > getAllVendor();

    Vendor getVendorById(int  vendorId);

    void deleteVendor(int  vendorId);
}
