package com.levelup.veecode.service;

import com.levelup.veecode.dto.CreditCardDTO;

public interface CreditCardService {

    boolean validateCreditCard(CreditCardDTO creditCardDTO);
}
