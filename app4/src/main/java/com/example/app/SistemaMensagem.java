package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Menagem enviada por: " + this.remetente.getNome() +
                "\nEmail: " + this.remetente.getEmail() +
                "\nCom telefones para contato: " + this.remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
