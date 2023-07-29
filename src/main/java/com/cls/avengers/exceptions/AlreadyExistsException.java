package com.cls.avengers.exceptions;

import lombok.Getter;

/**
 * Thrown if resource already exists
 *
 */
@SuppressWarnings("serial")
public class AlreadyExistsException extends RuntimeException {
    
    @Getter
    private final String errorCode;
    
    
    /**
     * constructor.ResponseStatus
     *
     * @param message Message
     * @param errorCode error code
     */
    public AlreadyExistsException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    /**
     * constructor.
     * @param message Message
     * @param exception Exception Object
     * @param errorCode error code
     */
    public AlreadyExistsException(String message, String errorCode, Exception exception) {
        super(message, exception);
        this.errorCode = errorCode;
    }
}
