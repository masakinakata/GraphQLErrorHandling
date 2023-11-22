package com.graphql.errorhandling.repository;

import com.graphql.errorhandling.entity.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    private final List<Author> authors;

    public AuthorRepository() {
        authors = new ArrayList<>();
        authors.add(new Author("author-1", "Joshua", "Bloch"));
        authors.add(new Author("author-2", "Douglas", "Adams"));
        authors.add(new Author("author-3", "Bill", "Bryson"));
    }

    public Author getAuthor(String id) {
        Author foundAuthor = authors.stream()
                .filter(author -> author.getId().equals(id))
                .findFirst()
                .orElse(null);

        return foundAuthor;
    }
}
