package com.springbootrestapi.springbootrestapi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrestapi.springbootrestapi.entites.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
