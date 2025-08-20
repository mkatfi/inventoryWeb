package com.phegondev.InventoryWeb.exceptions;

public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException(String message){
        super(message);
    }

}
