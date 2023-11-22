package com.graphql.errorhandling.service.dto;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class SelectBookServiceInDto {
    @NonNull
    private String id;
}
