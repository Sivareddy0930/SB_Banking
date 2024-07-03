package com.bankingApp.banking.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(ResourceNotFoundException.class)
        @ResponseStatus(code = HttpStatus.NOT_FOUND)
        public String NoResourceFound(ResourceNotFoundException ex) {
            return ex.getMessage();

        }

        @ExceptionHandler(NotEnoughAmountExecption.class)
        @ResponseStatus(code = HttpStatus.NOT_FOUND)
        public String NotEnoughAmount(NotEnoughAmountExecption ex){
            return ex.getMessage();
        }


    }



