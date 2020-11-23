package com.muratcelik.controller;

import com.muratcelik.entity.Author;
import com.muratcelik.entity.Book;
import com.muratcelik.entity.Publisher;
import com.muratcelik.service.IAuthorService;
import com.muratcelik.service.IBookService;
import com.muratcelik.service.IPublisherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private IAuthorService authorService;
    private IBookService bookService;
    private IPublisherService publisherService;

    @Autowired //Constructor injection
    public UserRestController(IAuthorService authorService, IBookService bookService, IPublisherService publisherService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.publisherService = publisherService;
    }
    //======================= AUTHOR =======================
    //GetAll
    @GetMapping(value = "/user/author")
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthor();
    }
    //GetById
    @GetMapping(value = "/user/author/{id}")
    public Optional<Author> getAuthorById(@PathVariable("id") long id) {
        return authorService.getAuthorById(id);
    }
    //DeleteById
    @DeleteMapping(value = "/admin/deleteAuthor")
    public ResponseEntity<String> deleteAuthor(@RequestBody Author author) {
        authorService.deleteAuthorById(author.getId());
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    //Add
    @PostMapping(value = "/admin/addAuthor")
    public ResponseEntity<String> addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    //Update
    @PutMapping(value = "/admin/updateAuthor")
    public ResponseEntity<String> updateAuthor(@RequestBody Author author) {
        authorService.updateAuthor(author);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    //======================= BOOK =======================
    //GetAll
    @GetMapping(value = "/user/book")
    public List<Book> getAllBook() {
        return bookService.getAllBook();
    }
    //GetById
    @GetMapping(value = "/user/book/{id}")
    public Optional<Book> getBookById(@PathVariable("id") long id) {
        return bookService.getBookById(id);
    }
    //DeleteById
    @DeleteMapping(value = "/admin/deleteBook")
    public ResponseEntity<String> deleteBook(@RequestBody Book book) {
        bookService.deleteBookById(book.getId());
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    //Add
    @PostMapping(value = "/admin/addBook")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    //Update
    @PutMapping(value = "/admin/updateBook")
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    //================= PUBLİSHER =======================
    //GetAll
    @GetMapping(value = "/user/publisher")
    public List<Publisher> getAllPublisher() {
        return publisherService.getAllPublisher();
    }
    //GetById
    @GetMapping(value = "/user/publisher/{id}")
    public Optional<Publisher> getPublisherById(@PathVariable("id") long id) {
        return publisherService.getPublisherById(id);
    }
    //DeleteById
    @DeleteMapping(value = "/admin/deletePublisher")
    public ResponseEntity<String> deletePublisher(@RequestBody Publisher publisher) {
        publisherService.deletePublisherById(publisher.getId());
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    //Add
    @PostMapping(value = "/admin/addPublisher")
    public ResponseEntity<String> addPublisher(@RequestBody Publisher publisher) {
        publisherService.addPublisher(publisher);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    //Update
    @PutMapping(value = "/admin/updatePublisher")
    public ResponseEntity<String> updatePublisher(@RequestBody Publisher publisher) {
        publisherService.updatePublisher(publisher);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    // FindBy
    @GetMapping(value = "/user/findAuthorName/{authorName}")
    public List<Book> getBookByAuthorName(@PathVariable("authorName") String authorName) {
        return authorService.findByName(authorName);
    }

    @GetMapping(value = "/user/findBookName/{bookName}")
    public Book findByBookName(@PathVariable("bookName") String bookName) {
        return bookService.findByName(bookName);
    }

    @GetMapping(value = "/user/findBookSerialName/{serialName}")
    public List<Book> findByBookSerialName(@PathVariable("serialName") String serialName) {
        return bookService.findBySerialName(serialName);
    }

    @GetMapping(value = "/user/findIsbnNo/{isbnNo}")
    public Book findByIsbnNo(@PathVariable("isbnNo") String isbnNo) {
        return bookService.findByIsbnNo(isbnNo);
    }
}
