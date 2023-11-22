package com.graphql.errorhandling.entity.error;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomInputValidationGraphQLError extends CustomGraphQLError {
    private String validationType;

    public CustomInputValidationGraphQLError(String message, String validationType) {
        super(message);
        this.validationType = validationType;
    }
}
