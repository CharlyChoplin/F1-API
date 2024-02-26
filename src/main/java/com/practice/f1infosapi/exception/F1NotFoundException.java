package com.practice.f1infosapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class F1NotFoundException extends RuntimeException {
    public F1NotFoundException(String msg) {
        super(msg);
    }
}
