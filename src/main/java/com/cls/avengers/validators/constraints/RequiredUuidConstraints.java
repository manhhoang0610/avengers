package com.cls.avengers.validators.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
@Pattern(regexp = "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
@NotNull
public @interface RequiredUuidConstraints {
    
    /**
     * @return the error message template
     */
    String message() default "{TODO}"; // TODO
    
    /**
     * @return the groups the constraint belongs to
     */
    Class<?>[] groups() default {};
    
    /**
     * @return the payload associated to the constraint
     */
    Class<? extends Payload>[] payload() default {};
    
}
