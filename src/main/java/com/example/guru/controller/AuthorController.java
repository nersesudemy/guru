package com.example.guru.controller;

import com.example.guru.model.Author;
import com.example.guru.repository.AuthorRepository;
import com.example.guru.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;
    private final AuthorService authorService;


    @RequestMapping("/authors")
    public String getAuthrors(Model model){
        Author author = authorService.findById(58L);

        Iterable<Author> authors = authorRepository.findAll();
        model.addAttribute("authors", authors);

        return "authors/list";
    }
}