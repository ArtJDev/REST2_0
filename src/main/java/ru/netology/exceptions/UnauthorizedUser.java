package ru.netology.exceptions;

public class UnauthorizedUser extends RuntimeException {
    private final String message;

    public UnauthorizedUser(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}