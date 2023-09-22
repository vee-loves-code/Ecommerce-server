package com.levelup.veecode.controller;

import com.levelup.veecode.dto.CreditCardDTO;
import com.levelup.veecode.response.CardResponse;
import com.levelup.veecode.service.CreditCardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/credit-cards")
public class CreditCardController {

    private final CreditCardService creditCardService;
    
    @PostMapping("/validate")
    public ResponseEntity<CardResponse> validateCreditCard(@RequestBody @Valid CreditCardDTO creditCard) {
        boolean isValid = creditCardService.validateCreditCard(creditCard);
        CardResponse response = new CardResponse();
        response.setValid(isValid);
        HttpStatus httpStatus = isValid ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
        return new ResponseEntity<>(response, httpStatus);
    }
}
