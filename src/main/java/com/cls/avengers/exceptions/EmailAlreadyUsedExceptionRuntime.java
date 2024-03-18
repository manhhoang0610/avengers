package com.cls.avengers.exceptions;

public class EmailAlreadyUsedExceptionRuntime extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EmailAlreadyUsedExceptionRuntime() {
        super("Email is already in use!");
    }
}
