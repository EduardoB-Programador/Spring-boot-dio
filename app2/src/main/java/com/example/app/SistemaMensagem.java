package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente tech;

    public void enviarConfirmacaoCadastro() {
        System.out.println(this.noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas() {
        tech.setEmail("tech@dio.com.br");
        System.out.println(this.tech);
        System.out.println("Bem vindo a Tech Elite");
    }

}
