package com.studypointsystem.studypoint.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.User;
import com.studypointsystem.studypoint.repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User addUser(User user) {
		
	 userRepository.save(user);
	 return user;
	}

	@Override
	public User updateUser(User user) {
		
		 userRepository.save(user);
		 return user;
	}

	@Override
	public void deleteUser(String userId) {
		
		Optional<User> entity = userRepository.findById(userId);
		User foundUser = entity.get();
		userRepository.delete(foundUser);
	}

	@Override
	public User getUser(String userId) {
		Optional<User> entity = userRepository.findById(userId);
		User foundUser = entity.get();
		return foundUser;
	}

}
