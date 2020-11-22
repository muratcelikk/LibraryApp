package com.muratcelik.service.implementation;

import com.muratcelik.entity.Author;
import com.muratcelik.entity.Book;
import com.muratcelik.repository.AuthorRepo;
import com.muratcelik.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService implements IAuthorService {

    private AuthorRepo authorRepo;

    @Autowired
    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorRepo.findAll();
    }

    @Override
    public void addAuthor(Author author) {
        authorRepo.save(author);
    }

    @Override
    public void deleteAuthorById(long id) {
        authorRepo.deleteById(id);
    }

    @Override
    public Optional<Author> getAuthorById(long id) {
        return authorRepo.findById(id);
    }

    @Override
    public void updateAuthor(Author authorUpdate) {
        Author author = authorRepo.getOne(authorUpdate.getId());
        author.setName(authorUpdate.getName());
        author.setSurname(authorUpdate.getSurname());
        author.setExplanation(authorUpdate.getExplanation());
        author.setBook(authorUpdate.getBook());
        authorRepo.save(author);
    }

    @Override
    public List<Book> findByName(String authorName) {
        return authorRepo.findByName(authorName);
    }
}
