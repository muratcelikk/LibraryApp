package com.muratcelik.repository;

import com.muratcelik.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Long> {
    Book findByName(String bookName);

    List<Book> findBySerialName(String serialName);

    Book findByIsbnNo(String isbnNo);
}
