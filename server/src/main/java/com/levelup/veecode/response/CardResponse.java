package com.levelup.veecode.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CardResponse {
    private boolean valid;
    
    public CardResponse() {
    }
    
    public void setValid(boolean valid) {
        this.valid = valid;
    }
}