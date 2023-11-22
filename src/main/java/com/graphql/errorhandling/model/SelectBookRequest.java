package com.graphql.errorhandling.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.NonNull;

@AllArgsConstructor
@Data
public class SelectBookRequest {
    @NonNull
    private final String id;
}
