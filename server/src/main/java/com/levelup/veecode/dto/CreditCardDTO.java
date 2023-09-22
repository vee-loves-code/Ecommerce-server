package com.levelup.veecode.dto;

import com.levelup.veecode.validate.annotation.isdigit.IsDigit;
import com.levelup.veecode.validate.annotation.validexpirydate.ValidExpiryDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardDTO {

    @NotBlank
    @Size(min = 16, max = 17, message = "Length of Card Number must be between 16 and 19 digits long")
    @IsDigit
    private String cardNumber;

    @NotBlank
    @ValidExpiryDate
    private String expiryDate;

    @NotBlank
    @IsDigit
    private String cvv;
    
    
}
