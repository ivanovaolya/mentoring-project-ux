package com.mentoring.controller.exception.handler;

import com.mentoring.controller.exception.DuplicateEmailException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ IllegalArgumentException.class, DuplicateEmailException.class })
    public ResponseEntity<Object> handleException(final Exception exception) {
        return new ResponseEntity<>(exception.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
}
