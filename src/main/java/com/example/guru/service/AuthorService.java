package com.example.guru.service;

import com.example.guru.model.Author;
import com.example.guru.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Author findById(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }


}
