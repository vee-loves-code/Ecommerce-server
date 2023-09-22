package com.levelup.veecode.validate.annotation.validexpirydate.impl;

import com.levelup.veecode.validate.annotation.validexpirydate.ValidExpiryDate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Slf4j
public class ValidExpiryDateImpl implements ConstraintValidator<ValidExpiryDate, String> {


    @Override
    public boolean isValid(String expiryDate, ConstraintValidatorContext constraintValidatorContext) {
        try {
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
            LocalDate parsedExpiryDate = LocalDate.parse(expiryDate, formatter);
            return parsedExpiryDate.isAfter(currentDate);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
