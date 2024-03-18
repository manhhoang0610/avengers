package com.cls.avengers.exceptions;

public class ResourceNotApprovedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public ResourceNotApprovedException(String message) {
        super(message);
    }
}
