package com.TrainingManagement.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.TrainingManagement.Repository.RoleRepository;
import com.TrainingManagement.models.Role;
import com.TrainingManagement.service.RoleService;

public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role getRoleById(int roleId) {
		
		Optional<Role> roleDb=this.roleRepository.findById(roleId);
		return roleDb.get();
	}

}
