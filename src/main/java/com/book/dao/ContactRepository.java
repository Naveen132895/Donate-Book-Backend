package com.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
