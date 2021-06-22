package com.example.guru.controller.rest;

import com.example.guru.model.Book;
import com.example.guru.repository.BookRepository;
import com.example.guru.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/book")
public class BookRestController {

    private final BookService bookService;


    @GetMapping
    public ResponseEntity<List<Book>> list() {

        List<Book> bookList =  bookService.findAll();

        return ResponseEntity.status(HttpStatus.OK)
                .body(bookList);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable(value = "id") long id) {

        Book book =  bookService.findById(id);

        return ResponseEntity.status(HttpStatus.OK)
                .body(book);

    }
}
