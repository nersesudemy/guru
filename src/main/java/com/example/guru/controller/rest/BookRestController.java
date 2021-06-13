package com.example.guru.controller.rest;

import com.example.guru.model.Book;
import com.example.guru.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/book")
public class BookRestController {

    private final BookRepository bookRepository;


    @GetMapping
    public ResponseEntity<List<Book>> list() {

        List<Book> bookList = (List<Book>) bookRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK)
                .body(bookList);

    }
}
