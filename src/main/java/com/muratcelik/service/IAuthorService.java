package com.muratcelik.service;

import com.muratcelik.entity.Author;
import com.muratcelik.entity.Book;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {

    List<Author> getAllAuthor();

    void addAuthor(Author author);

    void deleteAuthorById(long id);

    Optional<Author> getAuthorById(long id);

    void updateAuthor(Author authorUpdate);

    List<Book> findByName(String authorName);
}
