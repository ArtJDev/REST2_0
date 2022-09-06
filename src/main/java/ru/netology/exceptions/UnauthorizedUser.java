package ru.netology.exceptions;

public class UnauthorizedUser extends RuntimeException {
    private final String user;

    public UnauthorizedUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}