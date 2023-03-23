package org.example;

public class UserRegistrationException extends RuntimeException {
    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    public ExceptionType type;

    public UserRegistrationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}