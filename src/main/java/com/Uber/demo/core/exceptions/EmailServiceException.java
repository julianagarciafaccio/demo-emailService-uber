package com.Uber.demo.core.exceptions;

public class EmailServiceException extends RuntimeException{
    public EmailServiceException(String ms){
        super(ms);
    }
    public EmailServiceException(String msg,Throwable cause){
        super(msg,cause);
    }

}
