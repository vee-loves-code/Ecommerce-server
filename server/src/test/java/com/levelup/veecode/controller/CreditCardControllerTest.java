package com.levelup.veecode.controller;

import com.levelup.veecode.dto.CreditCardDTO;
import com.levelup.veecode.response.CardResponse;
import com.levelup.veecode.service.CreditCardService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditCardControllerTest {
    @Mock
    private CreditCardService creditCardService;
    
    @InjectMocks
    private CreditCardController creditCard;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    void testValidCreditCard() {
        CreditCardDTO validCard = new CreditCardDTO("4111111111111111", "1224","123");
        Mockito.when(creditCardService.validateCreditCard(validCard)).thenReturn(true);
        ResponseEntity<CardResponse> responseEntity = creditCard.validateCreditCard(validCard);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(true, responseEntity.getBody().isValid());
    }
    
    @Test
    void testInvalidCreditCard() {
        CreditCardDTO invalidCard = new CreditCardDTO("4111111111111112", "1223","123");
        Mockito.when(creditCardService.validateCreditCard(invalidCard)).thenReturn(false);
        ResponseEntity<CardResponse> responseEntity = creditCard.validateCreditCard(invalidCard);
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
        assertEquals(false, responseEntity.getBody().isValid());
    }
}