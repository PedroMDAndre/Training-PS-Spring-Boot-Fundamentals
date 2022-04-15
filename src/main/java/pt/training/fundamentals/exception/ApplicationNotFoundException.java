package pt.training.fundamentals.exception;

public class ApplicationNotFoundException extends RuntimeException {

    public ApplicationNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }

}
