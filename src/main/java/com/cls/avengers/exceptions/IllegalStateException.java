package com.cls.avengers.exceptions;

import lombok.Getter;

/**
 * Thrown if state is illegal
 *
 */
@SuppressWarnings("serial")
public class IllegalStateException extends RuntimeException {
    
    @Getter
    private final String errorCode;
    
    
    /**
     * constructor.
     *
     * @param message Message
     * @param errorCode error code
     */
    public IllegalStateException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    /**
     * constructor.
     * @param message Message
     * @param errorCode error code
     * @param exception Exception Object
     */
    public IllegalStateException(String message, String errorCode, Exception exception) {
        super(message, exception);
        this.errorCode = errorCode;
    }
}
