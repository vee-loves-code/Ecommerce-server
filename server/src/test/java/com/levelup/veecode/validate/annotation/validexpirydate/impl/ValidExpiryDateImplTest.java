package com.levelup.veecode.validate.annotation.validexpirydate.impl;

import jakarta.validation.ConstraintValidatorContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ValidExpiryDateImplTest {
    private ValidExpiryDateImpl validator;
    private ConstraintValidatorContext context;
    
    @BeforeEach
    void setUp() {
        validator = new ValidExpiryDateImpl();
        context = Mockito.mock(ConstraintValidatorContext.class);
    }
    
//    @Test
//    void testValidExpiryDate() {
//        String validExpiryDate = "12/2023";
//        assertTrue(validator.isValid(validExpiryDate, context));
//    }
    
    @Test
    void testInvalidExpiryDateInThePast() {
        String invalidExpiryDate = "12/2020";
        assertFalse(validator.isValid(invalidExpiryDate, context));
    }
    
    @Test
    void testInvalidExpiryDateWithInvalidFormat() {
        String invalidExpiryDate = "2020-12";
        assertFalse(validator.isValid(invalidExpiryDate, context));
    }
    
    @Test
    void testInvalidExpiryDateWithInvalidMonth() {
        String invalidExpiryDate = "13/2030";
        assertFalse(validator.isValid(invalidExpiryDate, context));
    }
    
    @Test
    void testInvalidExpiryDateWithInvalidYear() {
        String invalidExpiryDate = "12/20";
        assertFalse(validator.isValid(invalidExpiryDate, context));
    }
    
    @Test
    void testInvalidExpiryDateWithNonNumericCharacters() {
        String invalidExpiryDate = "12/adcd";
        assertFalse(validator.isValid(invalidExpiryDate, context));
    }

}