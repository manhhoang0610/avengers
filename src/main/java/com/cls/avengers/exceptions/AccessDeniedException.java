package com.cls.avengers.exceptions;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class AccessDeniedException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    public AccessDeniedException(String defaultMessage) {
        super(ErrorConstants.DEFAULT_TYPE, defaultMessage, Status.FORBIDDEN);
    }
}
