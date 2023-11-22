package com.graphql.errorhandling.model;

import com.graphql.errorhandling.entity.Book;
import com.graphql.errorhandling.entity.error.CustomGraphQLError;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SelectBookResponse {
    private Book book;
    private List<CustomGraphQLError> errors;
}
