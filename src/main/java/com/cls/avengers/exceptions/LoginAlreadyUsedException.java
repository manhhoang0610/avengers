package com.cls.avengers.exceptions;

public class LoginAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public LoginAlreadyUsedException() {
        super(ErrorConstants.LOGIN_ALREADY_USED_TYPE, "Số điện thoại đã tồn tại trong hệ thống!", "userManagement", "userexists");
    }
}
