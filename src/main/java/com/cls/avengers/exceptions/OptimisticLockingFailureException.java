package com.cls.avengers.exceptions;

import lombok.Getter;

/**
 * Thrown on an optimistic locking violation.
 *
 */
@Getter
@SuppressWarnings("serial")
public class OptimisticLockingFailureException extends RuntimeException {
    
    private final String errorCode;
    
    
    /**
     * constructor.
     *
     * @param message Message
     * @param errorCode error code
     */
    public OptimisticLockingFailureException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    /**
     * constructor.
     * @param message Message
     * @param errorCode error code
     * @param exception Exception Object
     */
    public OptimisticLockingFailureException(String message, String errorCode, Exception exception) {
        super(message, exception);
        this.errorCode = errorCode;
    }
}
