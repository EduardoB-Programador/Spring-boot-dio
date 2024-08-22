package com.example.app;

public class Remetente {
    private String nome;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Remetente {nome= \"" + this.nome + "\", email= \"" + this.email + "\"}";
    }
}
