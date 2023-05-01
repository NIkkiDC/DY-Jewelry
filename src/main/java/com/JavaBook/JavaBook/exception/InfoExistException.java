package com.JavaBook.JavaBook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class InfoExistException extends RuntimeException {
    public InfoExistException(String message) {
        super(message);
    }
}

