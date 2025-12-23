package com.springbootrestapi.springbootrestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapi.springbootrestapi.Dao.BookRepository;
import com.springbootrestapi.springbootrestapi.entites.Book;

@Service

public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    // get books by id

    public Book getBookByid(int id) {
        return bookRepository.findById(id).orElse(null);

    }

    // adding tha book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // using comparison operatior
    public void deleteBook(int bid) {
        bookRepository.deleteById(bid);
    }

    //
    public Book updateBook(Book book, int bookId) {
        book.setId(bookId);
        return bookRepository.save(book);
    }
}
