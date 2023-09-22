package com.levelup.veecode.validate.annotation.validexpirydate;

import com.levelup.veecode.validate.annotation.validexpirydate.impl.ValidExpiryDateImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;


@Target({FIELD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidExpiryDateImpl.class)
@Documented
public @interface ValidExpiryDate {

    String message() default "{Expired}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
