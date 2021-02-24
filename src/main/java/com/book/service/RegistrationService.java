package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.UserRepository;
import com.book.model.User;

@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository repo;
	
	public User saveUser(User user) {
		
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
	return	repo.findByUserMail(email);
	}
	
	public User fetchUserByEmailIdAndPassword(String email,String password) {
		return	repo.findByUserMailAndUserPassword(email,password);
		}

}
