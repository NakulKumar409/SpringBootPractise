package com.springbootrestapi.springbootrestapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.springbootrestapi.springbootrestapi.entites.Book;

@Component

public class BookService {
    private static List<Book> list = new ArrayList<>();
    static {
        list.add(new Book(12, "nakakkaksdskdsdj", "xyz"));
        list.add(new Book(13, "nakakkaksdskdsdj", "xysadasz"));
        list.add(new Book(14, "nakakkaksdskdssdsdsfsdfasdj", "xyzsdsdadsasdas"));
    }

    // get all books
    public List<Book> getAllBooks() {
        return list;
    }
    // get books by id

    public Book getBookByid(int id) {
        Book book = null;
        list.stream().filter(e -> e.getId() == id).findFirst();

        return book;
    }

    // adding tha book
    public Book addBook(Book b) {
        list.add(b);
        return b;
    }

    // delete book
    // public void deleteBook(int bid) {
    // list = list.stream().filter(book -> {
    // if (book.getId() != bid) {
    // return true;
    // } else {
    // return false;
    // }
    // }).collect(Collectors.toList());
    // }

    // using comparison operatior
    public void deleteBook(int bid) {
        list = list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());
    }

    //
    public void updateBook(Book book, int bookId) {
        list = list.stream().map(b -> {
            if (b.getId() == bookId) {
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;

        }).collect(Collectors.toList());
    }
}

