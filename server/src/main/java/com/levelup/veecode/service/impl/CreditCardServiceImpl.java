package com.levelup.veecode.service.impl;


import com.levelup.veecode.dto.CreditCardDTO;
import com.levelup.veecode.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {



    @Override
    public boolean validateCreditCard(CreditCardDTO creditCardDTO) {
        
        if (!isValidCVV(creditCardDTO.getCardNumber(), creditCardDTO.getCvv())) {
            return false;
        }
        if (!isValidLuhn(creditCardDTO.getCardNumber())) {
            return false;
        }
        return true;
    }


    private boolean isValidCVV(String cardNumber, String cvv) {
        int cvvLength = cardNumber.startsWith("34") || cardNumber.startsWith("37") ? 4 : 3;
        return cvv.length() == cvvLength;
    }


    private boolean isValidLuhn(String cardNumber) {
        int sum = 0;
        boolean doubleDigit = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }
}
