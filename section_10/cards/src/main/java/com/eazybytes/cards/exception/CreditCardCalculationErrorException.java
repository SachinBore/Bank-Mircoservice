package com.eazybytes.cards.exception;

import com.eazybytes.cards.constants.CardsConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
public class CreditCardCalculationErrorException extends RuntimeException {

    public CreditCardCalculationErrorException() {
        super(CardsConstants.CREDIT_ERROR_MESSAGE);
    }

}
