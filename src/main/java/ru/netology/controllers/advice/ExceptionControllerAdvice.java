package ru.netology.controllers.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.exceptions.InvalidCredentials;
import ru.netology.exceptions.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ResponseBody
    @ExceptionHandler(InvalidCredentials.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String exceptionInvalidCredentials(InvalidCredentials ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(UnauthorizedUser.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String exceptionUnauthorizedUser(UnauthorizedUser ex) {
        return ex.getMessage();
    }
}