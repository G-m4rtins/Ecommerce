package com.example.ecommerce.demo.exception;

public class UserException extends RuntimeException {

    public UserException(String message) {
        super(message);
    }

    public static UserException emailAlreadyExists(String message, String email) {
       
        return new UserException("Email " + email + " already exists. " + message);
    
    }

}
