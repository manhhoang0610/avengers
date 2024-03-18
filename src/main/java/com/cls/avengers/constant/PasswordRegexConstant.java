package com.cls.avengers.constant;

public final class PasswordRegexConstant {
    private PasswordRegexConstant() {
    }

    // Minimum eight characters, at least one letter and one number:
    public static final String PASSWORD_MIN_8_LETTER_NUMBER_REGEX
            = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
    public static final String PASSWORD_MIN_8_LETTER_NUMBER_MSG
            = "Minimum eight characters, at least one letter and one number";

    // Minimum eight characters, at least one letter, one number and one special character:
    public static final String PASSWORD_MIN_8_LETTER_NUMBER_SPECIAL_CHARACTER_REGEX
            = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
    public static final String PASSWORD_MIN_8_LETTER_NUMBER_SPECIAL_CHARACTER_MSG
            = "Minimum eight characters, at least one letter, one number and one special character";

    // Minimum eight characters, at least one uppercase letter, one lowercase letter and one number:
    public static final String PASSWORD_MIN_8_UPPER_LETTER_LOWER_LETTER_NUMBER_REGEX
            = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
    public static final String PASSWORD_MIN_8_UPPER_LETTER_LOWER_LETTER_NUMBER_MSG
            = "Minimum eight characters, at least one uppercase letter, one lowercase letter and one number";

    // Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character:
    public static final String PASSWORD_MIN_8_UPPER_LETTER_LOWER_LETTER_NUMBER_SPECIAL_CHARACTER_REGEX
            = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    public static final String PASSWORD_MIN_8_UPPER_LETTER_LOWER_LETTER_NUMBER_SPECIAL_CHARACTER_MSG
            = "Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character";

    // Minimum eight and maximum 10 characters, at least one uppercase letter, one lowercase letter, one number and one special character:
    public static final String PASSWORD_MIN_8_MAX_10_UPPER_LETTER_LOWER_LETTER_NUMBER_SPECIAL_CHARACTER_REGEX
            = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";
    public static final String PASSWORD_MIN_8_MAX_10_UPPER_LETTER_LOWER_LETTER_NUMBER_SPECIAL_CHARACTER_MSG
            = "Minimum eight and maximum 10 characters, at least one uppercase letter, one lowercase letter, one number and one special character";
}