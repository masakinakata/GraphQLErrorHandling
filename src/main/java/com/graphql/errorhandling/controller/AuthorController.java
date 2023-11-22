package com.graphql.errorhandling.controller;

import com.graphql.errorhandling.entity.Author;
import com.graphql.errorhandling.entity.Book;
import com.graphql.errorhandling.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @SchemaMapping
    public Author author(Book book) {
        return authorService.getAuthor(book.getAuthorId());
    }
}
