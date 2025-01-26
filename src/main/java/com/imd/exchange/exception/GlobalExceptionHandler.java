package com.imd.exchange.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(FailureException.class)
    public ResponseEntity<Object> handleFailureException(FailureException ex) {

        return new ResponseEntity<>(
                new ErrorResponse("Falha no sistema", ex.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
