package com.example.guru.controller;

import com.example.guru.model.Book;
import com.example.guru.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class BookController {

    private final BookRepository bookRepository;


    @RequestMapping("/books")
    public String getBooks(Model model){
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);

        return "books/list";
    }
}
