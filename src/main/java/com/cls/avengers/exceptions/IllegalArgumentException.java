package com.cls.avengers.exceptions;

import lombok.Getter;
import org.zalando.problem.AbstractThrowableProblem;

/**
 * Thrown to indicate that a method has been passed an illegal or inappropriate argument.
 */
@Getter
public class IllegalArgumentException extends AbstractThrowableProblem {

    private final String errorCode;


    /**
     * constructor.
     *
     * @param message   Message
     * @param errorCode error code
     */
    public IllegalArgumentException(String message, String errorCode) {
        super(null, message);
        this.errorCode = errorCode;
    }

    /**
     * constructor.
     *
     * @param message   Message
     * @param errorCode error code
     * @param exception Exception Object
     */
    public IllegalArgumentException(String message, String errorCode, Exception exception) {
        super(null, message);
        this.errorCode = errorCode;
    }
}
