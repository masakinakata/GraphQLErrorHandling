package com.graphql.errorhandling.repository.dto;

import com.graphql.errorhandling.entity.Book;
import com.graphql.errorhandling.entity.error.CustomGraphQLError;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class SelectBookRepositoryOutDto {
    private Book book;
    private List<CustomGraphQLError> errors;
}
