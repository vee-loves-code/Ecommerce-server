package com.levelup.veecode.validate.annotation.isdigit.impl;

import jakarta.validation.ConstraintValidatorContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class IsDigitImplTest {
    private IsDigitImpl validator;
    private ConstraintValidatorContext context;
    
    @BeforeEach
    void setUp() {
        validator = new IsDigitImpl();
        context = Mockito.mock(ConstraintValidatorContext.class);
    }
    
    @Test
    void testValidDigits() {
        String validDigits = "12345";
        assertTrue(validator.isValid(validDigits, context));
    }
    
    @Test
    void testEmptyString() {
        String emptyString = "";
        assertTrue(validator.isValid(emptyString, context));
    }
    
    @Test
    void testNullString() {
        assertTrue(validator.isValid(null, context));
    }
    
    @Test
    void testInvalidCharacters() {
        String invalidChars = "12345abc";
        assertFalse(validator.isValid(invalidChars, context));
    }

}