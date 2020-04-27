package com.TrainingManagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TrainingManagement.Repository.UserRepository;
import com.TrainingManagement.models.User;
import com.TrainingManagement.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	@PersistenceContext
	private EntityManager entityManager;

	public Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	@Override
	public List<User> getAllUser() {
		return (List<User>) this.userRepository.findAll();
	}

	@Override
	public User getUserByUserName(String empName) {
		return null;

	}

	@Override
	public User validate(int empId, String password) {
		try {
			Session session = (Session) entityManager.getEntityManagerFactory();
			User userObj = session.get(User.class, empId);
			if (userObj != null) {
				if (userObj.getPassword().equals(password)) {
					return userObj;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
