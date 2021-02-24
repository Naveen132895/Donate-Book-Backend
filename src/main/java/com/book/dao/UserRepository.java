package com.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByUserMail(String email);
	
	public User findByUserMailAndUserPassword(String email,String password);

}
