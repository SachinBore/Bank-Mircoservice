package com.eazybytes.loans.exception;

import com.eazybytes.loans.constants.LoansConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
public class LoanCalculationErrorException extends RuntimeException{

    public LoanCalculationErrorException() {
        super(LoansConstants.LOAN_ERROR_MESSAGE);
    }
}
