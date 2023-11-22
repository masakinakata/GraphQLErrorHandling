package com.graphql.errorhandling;

import com.graphql.errorhandling.entity.error.CustomInputValidationGraphQLError;
import com.graphql.errorhandling.entity.error.CustomNotFoundGraphQLError;
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.ClassNameTypeResolver;

@Configuration
public class GraphQLConfig {
    @Bean
    public GraphQlSourceBuilderCustomizer sourceBuilderCustomizer() {
        return (builder) -> {
            ClassNameTypeResolver classNameTypeResolver = new ClassNameTypeResolver();
            classNameTypeResolver.addMapping(CustomNotFoundGraphQLError.class, "NotFoundError");
            classNameTypeResolver.addMapping(CustomInputValidationGraphQLError.class, "InputValidationError");

            builder.defaultTypeResolver(classNameTypeResolver);
        };
    }
}
