package com.cls.avengers.exceptions;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class InvalidPasswordException extends AbstractThrowableProblem {

    private final String errorCode;

    private static final long serialVersionUID = 1L;


    /**
     * constructor.
     *
     * @param message   Message
     * @param errorCode error code
     */
    public InvalidPasswordException(String message, String errorCode) {
        super(null, message);
        this.errorCode = errorCode;
    }

    public InvalidPasswordException() {
        super(ErrorConstants.INVALID_PASSWORD_TYPE, "Sai mật khẩu", Status.BAD_REQUEST);
        this.errorCode = null;
    }

    /**
     * constructor.
     *
     * @param message   Message
     * @param errorCode error code
     * @param exception Exception Object
     */
    public InvalidPasswordException(String message, String errorCode, Exception exception) {
        super(null, message);
        this.errorCode = errorCode;
    }
}
