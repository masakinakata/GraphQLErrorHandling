package com.graphql.errorhandling.service;

import com.graphql.errorhandling.entity.Author;
import com.graphql.errorhandling.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public Author getAuthor(String id) {
        return authorRepository.getAuthor(id);
    }
}
