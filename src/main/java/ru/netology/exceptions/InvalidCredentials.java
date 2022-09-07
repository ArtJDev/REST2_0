package ru.netology.exceptions;

public class InvalidCredentials extends RuntimeException {
    private final String message;

    public InvalidCredentials(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}