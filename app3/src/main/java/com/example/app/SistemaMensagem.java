package com.example.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    //Depois do ":" significa que caso não encontre o valor a ser utilizado é o que fica logo após
    @Value("${name:NoReply-DIO}")
    private String nome;

    @Value("${email:dio@dio.com.br}")
    private String email;

    @Value("${telefones}")
    private List<String> telefones = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Menagem enviada por: " + this.nome +
                "\nEmail: " + this.email +
                "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado");
    }
}
