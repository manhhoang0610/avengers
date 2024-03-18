package com.cls.avengers.exceptions;

import lombok.Getter;

/**
 * Thrown if field name is not found
 *
 */
@Getter
@SuppressWarnings("serial")
public class FieldException extends RuntimeException {

    private final String errorCode;


    /**
     * constructor.
     *
     * @param message Message
     * @param errorCode error code
     */
    public FieldException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * constructor.
     * @param message Message
     * @param errorCode error code
     * @param exception Exception Object
     */
    public FieldException(String message, String errorCode, Exception exception) {
        super(message, exception);
        this.errorCode = errorCode;
    }
}
