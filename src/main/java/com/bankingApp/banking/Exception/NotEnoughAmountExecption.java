package com.bankingApp.banking.Exception;

public class NotEnoughAmountExecption extends  RuntimeException{
    public NotEnoughAmountExecption(String message){
        super(message);
    }
}
