package pt.training.fundamentals.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationNotFoundException extends RuntimeException implements GraphQLError {

    private final Map<String, Object> extensions = new HashMap<>();

    public ApplicationNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }

    public ApplicationNotFoundException(String exceptionMessage, Long invalidApplicationId) {
        super(exceptionMessage);
        extensions.put("invalidApplicationId", invalidApplicationId);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return new ArrayList<>();
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }

}
