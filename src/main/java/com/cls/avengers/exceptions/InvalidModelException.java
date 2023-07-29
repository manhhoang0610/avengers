package com.cls.avengers.exceptions;

import lombok.Getter;

/**
 * Exception thrown if state of model instance is invalid.
 *
 */
@SuppressWarnings("serial")
public class InvalidModelException extends RuntimeException {
    
    @Getter
    private final String errorCode;
    
    
    /**
     * constructor.
     *
     * @param message Message
     * @param errorCode error code
     */
    public InvalidModelException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    /**
     * constructor.
     * @param message Message
     * @param errorCode error code
     * @param exception Exception Object
     */
    public InvalidModelException(String message, String errorCode, Exception exception) {
        super(message, exception);
        this.errorCode = errorCode;
    }
}
