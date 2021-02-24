package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Contact;
import com.book.service.ContactService;
import com.book.service.MailService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private MailService mailService;
	
	// for adding contactus
		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/addcontact")
		public Contact addContact(@RequestBody Contact contact){
			
			try {
			
			String content="A Person Named "+contact.getName();
			content +=" Contacted You From Your Book Donation App. His/Her Mobile Number is "+contact.getMobile();
			content +=". Belongs To Company "+contact.getCompany();
			content +=". Their Message: "+contact.getMessage();
			mailService.send(contact.getEmail(), "veeranavin0001@gmail.com", contact.getSubject(), content);
			System.out.println("mail sent");
			}catch(Exception e) {
				System.out.println(e);
				
			}
				
			return contactService.addContact(contact);
			
		}

}
