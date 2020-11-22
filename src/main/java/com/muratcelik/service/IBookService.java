package com.muratcelik.service;

import com.muratcelik.entity.Author;
import com.muratcelik.entity.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    List<Book> getAllBook();

    void addBook(Book book);

    void deleteBookById(long id);

    Optional<Book> getBookById(long id);

    void updateBook(Book bookUpdate);

    Book findByName(String bookName);

    List<Book> findBySerialName(String serialName);

    Book findByIsbnNo(String isbnNo);
}
