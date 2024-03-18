package com.cls.avengers.exceptions;

import java.net.URI;

public final class ErrorConstants {

    public static final String ERR_CONCURRENCY_FAILURE = "error.concurrencyFailure";
    public static final String ERR_VALIDATION = "error.validation";
    public static final String PROBLEM_BASE_URL = "https://www.jhipster.tech/problem";
    public static final URI DEFAULT_TYPE = URI.create(PROBLEM_BASE_URL + "/problem-with-message");
    public static final URI CONSTRAINT_VIOLATION_TYPE = URI.create(PROBLEM_BASE_URL + "/constraint-violation");
    public static final URI INVALID_PASSWORD_TYPE = URI.create(PROBLEM_BASE_URL + "/invalid-password");
    public static final URI PHONE_NUMBER_ALREADY_USED_TYPE = URI.create(PROBLEM_BASE_URL + "/phoneNumber-already-used");
    public static final URI LOGIN_ALREADY_USED_TYPE = URI.create(PROBLEM_BASE_URL + "/login-already-used");
    public static final URI LOAN_ALREADY_REGISTERED = URI.create(PROBLEM_BASE_URL + "/loan-already-registered");


    public static class User {

        public static final String NOT_FOUND = "Tài khoản không tồn tại";
        public static final String INACTIVE = "Tài khoản đã bị khóa";
        public static final String BAD_CREDENTIAL = "Tài khoản hoặc mật khẩu không đúng. Liên hệ CSKH.";
    }

    public static class UserDetail {

        public static final String NOT_FOUND = "Thông tin chi tiết tài khoản không tồn tại";

        public static final String ID_CARD_INFO_LOCKED = "Bạn không thể cập nhật thông tin CMND/CCCD.";

        public static final String BANK_CARD_INFO_LOCKED = "Bạn không thể cập nhật thông tin thẻ ngân hàng.";
    }

    public static class Loan {

        public static final String NOT_FOUND = "Khoản vay không tồn tại";
        public static final String APPROVED_NOT_EDIT = "Khoản vay đã được phê duyệt, không thể cập nhật thông tin";
        public static final String UN_APPROVE = "Tài khoản chưa đủ điều kiện rút tiền do khoản vay chưa được phê duyệt";
        public static final String AMOUNT_MUST_BE_GREATER = "Số tiền phải lớn hơn số tiền ban đầu";
        public static final String PASSWORD_EMPTY = "Hệ thống bị xâm phạm, khoản vay của bạn tạm thời bị khóa. Vui lòng liên hệ CSKH để được hỗ trợ";
    }

    public static class CommonInfo {
        public static final String NOT_FOUND = "Cấu hình thông tin chung không tồn tại";
    }

    public static class Contract {
        public static final String NOT_FOUND = "Hợp đồng không tồn tại";
    }

    public static class FileAttach {
        public static final String NOT_FOUND = "File không tồn tại";
    }

    public static class State {
        public static final String NOT_FOUND = "Trạng thái không tồn tại";
    }

    private ErrorConstants() {
    }
}
