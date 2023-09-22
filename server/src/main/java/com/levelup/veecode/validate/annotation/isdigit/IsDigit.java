package com.levelup.veecode.validate.annotation.isdigit;

import com.levelup.veecode.validate.annotation.isdigit.impl.IsDigitImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = IsDigitImpl.class)
@Documented
public @interface IsDigit {

    String message() default "{Must be all digits}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
