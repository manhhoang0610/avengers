package com.cls.avengers.exceptions;

public class InvalidPasswordExceptionRuntime extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidPasswordExceptionRuntime() {
        super("Sai mật khẩu");
    }
}
