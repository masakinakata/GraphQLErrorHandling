package com.graphql.errorhandling.entity.error.extensions;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomExtensions {
    private String code;
}
