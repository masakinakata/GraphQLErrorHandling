package com.graphql.errorhandling.service.dto;

import com.graphql.errorhandling.entity.Book;
import com.graphql.errorhandling.entity.error.CustomGraphQLError;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class SelectBookServiceOutDto {
    Book book;
    List<CustomGraphQLError> errors;
}
