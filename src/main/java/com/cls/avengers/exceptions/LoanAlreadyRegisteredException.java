package com.cls.avengers.exceptions;

public class LoanAlreadyRegisteredException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public LoanAlreadyRegisteredException() {
        super(ErrorConstants.LOAN_ALREADY_REGISTERED, "Không thể đăng ký. Đang có một khoản vay đang chờ được phê duyệt", "loan", "loanAlreadyRegistered");
    }
}
