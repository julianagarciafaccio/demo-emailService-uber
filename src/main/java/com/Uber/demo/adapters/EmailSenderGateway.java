package com.Uber.demo.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject,String body);
}
