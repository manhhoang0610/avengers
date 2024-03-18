package com.cls.avengers.exceptions;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class UnAuthorizeException extends AbstractThrowableProblem {

    public UnAuthorizeException(String defaultMessage) {
        super(ErrorConstants.DEFAULT_TYPE, defaultMessage, Status.UNAUTHORIZED);
    }
}
