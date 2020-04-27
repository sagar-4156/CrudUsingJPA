package com.TrainingManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.TrainingManagement.Repository.UserRepository;
import com.TrainingManagement.configuration.UserPrincipal;
import com.TrainingManagement.models.User;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Bean
    public UserDetails loadUserByUsername(String empName) throws UsernameNotFoundException {
        User user = userRepository.findByEmpName(empName);
       
   
        if(user==null)
        	throw new UsernameNotFoundException("user 404");
        return new UserPrincipal(user);
    }
}
