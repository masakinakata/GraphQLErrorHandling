package com.graphql.errorhandling.controller;

import com.graphql.errorhandling.mapper.BookMapper;
import com.graphql.errorhandling.model.SelectBookRequest;
import com.graphql.errorhandling.model.SelectBookResponse;
import com.graphql.errorhandling.service.BookService;
import com.graphql.errorhandling.service.dto.SelectBookServiceInDto;
import com.graphql.errorhandling.service.dto.SelectBookServiceOutDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookMapper mapper;

    @QueryMapping
    public SelectBookResponse bookById(@Argument @NonNull SelectBookRequest selectBookRequest) {
        SelectBookServiceInDto selectBookServiceInDto = mapper.toSelectBookServiceInDto(selectBookRequest);
        SelectBookServiceOutDto selectBookServiceOutDto = bookService.bookById(selectBookServiceInDto);
        return mapper.toSelectBookResponse(selectBookServiceOutDto);
    }
}
