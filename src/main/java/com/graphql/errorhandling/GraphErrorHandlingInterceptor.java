package com.graphql.errorhandling;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import org.springframework.graphql.server.WebGraphQlInterceptor;
import org.springframework.graphql.server.WebGraphQlRequest;
import org.springframework.graphql.server.WebGraphQlResponse;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.List;


@Component
public class GraphErrorHandlingInterceptor implements WebGraphQlInterceptor {
    @Override
    @NonNull
    public Mono<WebGraphQlResponse> intercept(@NonNull WebGraphQlRequest request, @NonNull Chain chain) {
        return chain.next(request).map(response -> {
            if (response.isValid())
                return response;

            List<GraphQLError> errors = response.getErrors().stream()
                    .map(error -> {
                        ErrorClassification errorType = error.getErrorType();
                        System.out.println(errorType);
                        return GraphQLError.newError().errorType(ErrorType.InvalidSyntax).message(error.getMessage()).build();
                    })
                    .toList();

            return response.transform(builder -> builder.errors(errors).build());
        });
    }
}
