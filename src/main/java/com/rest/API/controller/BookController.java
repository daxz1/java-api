package com.rest.api.controller;

import com.rest.api.model.Book;
import com.rest.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

    // Get All Books
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
