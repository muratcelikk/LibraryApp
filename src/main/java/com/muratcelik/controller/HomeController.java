package com.muratcelik.controller;

import com.muratcelik.entity.Author;
import com.muratcelik.entity.Book;
import com.muratcelik.entity.Publisher;
import com.muratcelik.service.IAuthorService;
import com.muratcelik.service.IBookService;
import com.muratcelik.service.IPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class HomeController {

    
    private IBookService bookService; 
    private IAuthorService authorService;
    private IPublisherService publisherService;
    
    @Autowired
    public HomeController(IBookService bookService, IAuthorService authorService, IPublisherService publisherService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.publisherService = publisherService;
    }

    @GetMapping("/")
    public String Homepage(){
        return "home";
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    //BOOK
    @GetMapping("/book")
    public String book(Model model) {
        model.addAttribute("dash", bookService.getAllBook());
        return "book";
    }
    @GetMapping("/listAddBook")
    public String addListBook(Model model){
        Book modelEntity = new Book();
        model.addAttribute("modelEntity", modelEntity);
        return "addBook";
    }
    @PostMapping("/addBook")
    public String addBook(@ModelAttribute("book") Book modelEntity){
        bookService.addBook(modelEntity);
        return "redirect:/";
    }
    @GetMapping("/updateBook/{id}")
    public String updateBook(@PathVariable (value = "id") long id, Model model){
        Optional<Book> modelEntity = bookService.getBookById(id);
        model.addAttribute("modelEntity", modelEntity);
        return "updateBook";
    }
    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable (value = "id") long id){
        bookService.deleteBookById(id);
        return "redirect:/";
    }
    //Author
    @GetMapping("/author")
    public String authorView(Model model){
        model.addAttribute("author", authorService.getAllAuthor());
        return "author";
    }
    @GetMapping("/listAddAuthor")
    public String addListAuthor(Model model){
        Author author = new Author();
        model.addAttribute("author", author);
        return "addAuthor";
    }
    @PostMapping("/addAuthor")
    public String addAuthor(@ModelAttribute("author") Author author){
        authorService.addAuthor(author);
        return "redirect:/";
    }
    @GetMapping("/updateAuthor/{id}")
    public String updateAuthor(@PathVariable (value = "id") long id, Model model){
        Optional<Author> author = authorService.getAuthorById(id);
        model.addAttribute("author", author);
        return "updateAuthor";
    }
    @GetMapping("/deleteAuthor/{id}")
    public String deleteAuthor(@PathVariable (value = "id") long id){
        authorService.deleteAuthorById(id);
        return "redirect:/";
    }
    //Publisher
    @GetMapping("/publisher")
    public String publisherView(Model model){
        model.addAttribute("publisher", publisherService.getAllPublisher());
        return "publisher";
    }
    @GetMapping("/listAddPublisher")
    public String addPublisher(Model model){
        Publisher publisher = new Publisher();
        model.addAttribute("publisher", publisher);
        return "addPublisher";
    }
    @PostMapping("/addPublisher")
    public String addPublisher(@ModelAttribute("publisher") Publisher publisher){
        publisherService.addPublisher(publisher);
        return "redirect:/";
    }
    @GetMapping("/updatePublisher/{id}")
    public String updatePublisher(@PathVariable (value = "id") long id, Model model){
        Optional<Publisher> publisher = publisherService.getPublisherById(id);
        model.addAttribute("publisher", publisher);
        return "updatePublisher";
    }
    @GetMapping("/deletePublisher/{id}")
    public String deletePublisher(@PathVariable (value = "id") long id){
        publisherService.deletePublisherById(id);
        return "redirect:/";
    }
}
