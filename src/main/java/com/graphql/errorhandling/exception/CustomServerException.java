package com.graphql.errorhandling.exception;

import graphql.language.SourceLocation;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
public class CustomServerException extends Exception{
    private SourceLocation location;

}
