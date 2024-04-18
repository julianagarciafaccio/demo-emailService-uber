package com.Uber.demo.core;

public interface EmailSenderUseCase {
    //na camada core, q define os casos de uso da aplicacao,camada q diz oq deve fazer MAS nao como ela deve fazer,camada q define o contrato da aplicacao
    void sendEmail(String to,String subject,String body);
}
