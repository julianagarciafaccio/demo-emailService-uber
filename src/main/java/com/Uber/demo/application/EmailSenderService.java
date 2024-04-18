package com.Uber.demo.application;

import com.Uber.demo.adapters.EmailSenderGateway;
import com.Uber.demo.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {
    private final EmailSenderGateway emailSenderGateway;
    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }
    // chamando o metodo
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to,subject,body);
    }
}
