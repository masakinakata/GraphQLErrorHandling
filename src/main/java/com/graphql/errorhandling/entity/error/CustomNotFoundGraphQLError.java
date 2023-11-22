package com.graphql.errorhandling.entity.error;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomNotFoundGraphQLError extends CustomGraphQLError {
    private final int resourceId;

    public CustomNotFoundGraphQLError(String message, int resourceId) {
        super(message);
        this.resourceId = resourceId;
    }
}
