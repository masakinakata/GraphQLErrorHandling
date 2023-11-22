package com.graphql.errorhandling.service;

import com.graphql.errorhandling.mapper.BookMapper;
import com.graphql.errorhandling.repository.BookRepository;
import com.graphql.errorhandling.repository.dto.SelectBookRepositoryInDto;
import com.graphql.errorhandling.repository.dto.SelectBookRepositoryOutDto;
import com.graphql.errorhandling.service.dto.SelectBookServiceInDto;
import com.graphql.errorhandling.service.dto.SelectBookServiceOutDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookMapper mapper;

    public SelectBookServiceOutDto bookById(SelectBookServiceInDto selectBookServiceInDto) {
        SelectBookRepositoryInDto selectBookRepositoryInDto = mapper.toSelectBookRepositoryInDto(selectBookServiceInDto);

        SelectBookRepositoryOutDto selectBookRepositoryOutDto = bookRepository.bookById(selectBookRepositoryInDto);

        return mapper.toSelectBookServiceOutDto(selectBookRepositoryOutDto);
    }
}
