package com.cls.avengers.validators.constraints;

import com.cls.avengers.constant.PasswordRegexConstant;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Bean Validation annotation for UUID ({@code id}) field.
 */
@Documented
@Target({
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.PARAMETER,
        ElementType.TYPE_USE,
        ElementType.TYPE_PARAMETER
})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = PasswordRegexConstant.PASSWORD_MIN_8_MAX_10_UPPER_LETTER_LOWER_LETTER_NUMBER_SPECIAL_CHARACTER_REGEX)
@NotNull
public @interface PasswordMin8Max10UpperLetterLowerLetterNumberSpecialCharacterConstraint {

    /**
     * @return the error message template
     */
    String message() default PasswordRegexConstant.PASSWORD_MIN_8_MAX_10_UPPER_LETTER_LOWER_LETTER_NUMBER_SPECIAL_CHARACTER_MSG;

    /**
     * @return the groups the constraint belongs to
     */
    Class<?>[] groups() default {};

    /**
     * @return the payload associated to the constraint
     */
    Class<? extends Payload>[] payload() default {};

}
