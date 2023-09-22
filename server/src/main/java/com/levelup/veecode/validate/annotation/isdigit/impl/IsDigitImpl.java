package com.levelup.veecode.validate.annotation.isdigit.impl;

import com.levelup.veecode.validate.annotation.isdigit.IsDigit;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsDigitImpl implements ConstraintValidator<IsDigit, String> {

    @Override
    public boolean isValid(String input, ConstraintValidatorContext constraintValidatorContext) {
        return input.chars().allMatch(Character::isDigit);
    }
}
