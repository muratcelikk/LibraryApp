package com.muratcelik.repository;

import com.muratcelik.entity.Author;
import com.muratcelik.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepo extends JpaRepository<Author, Long> {
    List<Book> findByName(String authorName);
}
