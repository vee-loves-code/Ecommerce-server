package com.levelup.veecode.service.impl;

import com.levelup.veecode.dto.CreditCardDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceImplTest {
    private CreditCardServiceImpl creditCardService;
    
    @BeforeEach
    void setUp() {
        creditCardService = new CreditCardServiceImpl();
    }
    
    @Test
    void testValidCreditCard() {
        CreditCardDTO validCard = new CreditCardDTO("4111111111111111", "1224", "123");
        assertTrue(creditCardService.validateCreditCard(validCard));
    }
    
    @Test
    void testInvalidCVV() {
        CreditCardDTO invalidCVVCard = new CreditCardDTO("4111111111111111", "1224","1523");
        assertFalse(creditCardService.validateCreditCard(invalidCVVCard));
    }
    
    @Test
    void testInvalidLuhn() {
        CreditCardDTO invalidLuhnCard = new CreditCardDTO("4111111111111112", "1224", "123");
        assertFalse(creditCardService.validateCreditCard(invalidLuhnCard));
    }
    
    @Test
    void testValidAmexCard() {
        CreditCardDTO validAmexCard = new CreditCardDTO("371449635398431", "1234","1224");
        assertTrue(creditCardService.validateCreditCard(validAmexCard));
    }
    
    @Test
    void testInvalidAmexCVV() {
        CreditCardDTO invalidAmexCVVCard = new CreditCardDTO("371449635398431", "123","122");
        assertFalse(creditCardService.validateCreditCard(invalidAmexCVVCard));
    }

}