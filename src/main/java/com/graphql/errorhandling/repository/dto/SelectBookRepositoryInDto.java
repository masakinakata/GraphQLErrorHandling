package com.graphql.errorhandling.repository.dto;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class SelectBookRepositoryInDto {
    @NonNull
    private String id;
}
