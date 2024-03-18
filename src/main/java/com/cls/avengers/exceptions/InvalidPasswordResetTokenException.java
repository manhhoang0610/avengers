package com.cls.avengers.exceptions;

import lombok.Getter;

/**
 * Thrown if resource is not found
 *
 */
@Getter
public class InvalidPasswordResetTokenException extends RuntimeException {

    private final String errorCode;


    /**
     * constructor.
     *
     * @param message Message
     * @param errorCode error code
     */
    public InvalidPasswordResetTokenException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * constructor.
     * @param message Message
     * @param errorCode error code
     * @param exception Exception Object
     */
    public InvalidPasswordResetTokenException(String message, String errorCode, Exception exception) {
        super(message, exception);
        this.errorCode = errorCode;
    }
}
