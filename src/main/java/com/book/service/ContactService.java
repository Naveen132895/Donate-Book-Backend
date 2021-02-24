package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.ContactRepository;
import com.book.model.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepo;
	

	public Contact addContact(Contact contact) {
		return	contactRepo.save(contact);
		}
	
	
}
