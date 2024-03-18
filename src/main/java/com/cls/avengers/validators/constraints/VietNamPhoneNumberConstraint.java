package com.cls.avengers.validators.constraints;

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
@Pattern(regexp = PatternConstants.PHONE_NUMBER_REGEX)
@NotNull
public @interface VietNamPhoneNumberConstraint {
    
    /**
     * @return the error message template
     */
    String message() default "Phone number is invalid";
    
    /**
     * @return the groups the constraint belongs to
     */
    Class<?>[] groups() default {};
    
    /**
     * @return the payload associated to the constraint
     */
    Class<? extends Payload>[] payload() default {};
    
}
