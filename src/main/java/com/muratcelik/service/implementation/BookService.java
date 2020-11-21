package com.muratcelik.service.implementation;

import com.muratcelik.entity.Author;
import com.muratcelik.entity.Book;
import com.muratcelik.repository.BookRepo;
import com.muratcelik.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {

    private BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    @Override
    public void addBook(Book book) {
        bookRepo.save(book);
    }

    @Override
    public void deleteBookById(long id) {
        bookRepo.deleteById(id);
    }

    @Override
    public Optional<Book> getBookById(long id) {
        return bookRepo.findById(id);
    }

    @Override
    public void updateBook(Book bookUpdate) {
        Book book = bookRepo.getOne(bookUpdate.getId());
        book.setName(bookUpdate.getName());
        book.setSubName(bookUpdate.getSubName());
        book.setSerialName(bookUpdate.getSerialName());
        book.setIsbnNo(bookUpdate.getIsbnNo());
        book.setExplanation(bookUpdate.getExplanation());
        book.setAuthor(bookUpdate.getAuthor());
        book.setPublisher(bookUpdate.getPublisher());
        bookRepo.save(book);
    }
}
