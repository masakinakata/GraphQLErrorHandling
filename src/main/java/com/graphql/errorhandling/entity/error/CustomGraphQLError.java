package com.graphql.errorhandling.entity.error;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CustomGraphQLError {
    private String message;
}
