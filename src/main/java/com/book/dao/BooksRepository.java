package com.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.Books;

public interface BooksRepository extends JpaRepository <Books, Integer> {

}
