package com.graphql.errorhandling.repository;

import com.graphql.errorhandling.entity.Book;
import com.graphql.errorhandling.entity.error.CustomGraphQLError;
import com.graphql.errorhandling.entity.error.CustomNotFoundGraphQLError;
import com.graphql.errorhandling.repository.dto.SelectBookRepositoryInDto;
import com.graphql.errorhandling.repository.dto.SelectBookRepositoryOutDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final List<Book> books;

    public BookRepository() {
        books = new ArrayList<>();
        books.add(new Book("book-1", "Effective Java", 416, "author-1"));
        books.add(new Book("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"));
        books.add(new Book("book-3", "Down Under", 436, "author-3"));
    }

    public SelectBookRepositoryOutDto bookById(SelectBookRepositoryInDto selectBookRepositoryInDto) {
        Book foundBook = books.stream()
                .filter(book -> book.getId().equals(selectBookRepositoryInDto.getId()))
                .findFirst()
                .orElse(null);

        List<CustomGraphQLError> errors = new ArrayList<>();
        if(foundBook == null)
            errors.add(new CustomNotFoundGraphQLError("book is not found", 404));

        return SelectBookRepositoryOutDto.builder()
                .book(foundBook)
                .errors(errors)
                .build();

    }
}
