package com.jatin.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jatin.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
