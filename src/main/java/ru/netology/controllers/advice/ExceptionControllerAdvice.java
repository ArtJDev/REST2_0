package ru.netology.controllers.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.exceptions.InvalidCredentials;
import ru.netology.exceptions.UnauthorizedUser;
import ru.netology.model.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<ErrorDetails> exceptionInvalidCredentials() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("User name or password is empty");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<ErrorDetails> exceptionUnauthorizedUser(UnauthorizedUser unauthorizedUser) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Unknown user: " + unauthorizedUser.getUser());

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(errorDetails);
    }
}