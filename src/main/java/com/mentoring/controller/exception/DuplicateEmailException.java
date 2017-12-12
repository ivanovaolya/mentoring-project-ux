package com.mentoring.controller.exception;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
public class DuplicateEmailException extends Exception {

    public DuplicateEmailException(final String message) {
        super(message);
    }

}
