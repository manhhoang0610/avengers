package com.cls.avengers.exceptions;

import lombok.Getter;

/**
 * Thrown to indicate that a method has been passed an illegal or inappropriate argument.
 *
 */
@SuppressWarnings("serial")
public class IllegalArgumentException extends RuntimeException {
    
    @Getter
    private final String errorCode;
    
    
    /**
     * constructor.
     *
     * @param message Message
     * @param errorCode error code
     */
    public IllegalArgumentException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    /**
     * constructor.
     * @param message Message
     * @param errorCode error code
     * @param exception Exception Object
     */
    public IllegalArgumentException(String message, String errorCode, Exception exception) {
        super(message, exception);
        this.errorCode = errorCode;
    }
}
