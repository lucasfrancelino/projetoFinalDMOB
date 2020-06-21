package com.example.projetodmob;

public class Contato {
    String nome;
    String telefone;

    // metodos que pegam os dados e devolvem para a main

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString(){
        return ("Nome: ") + nome + ("  Telefone: ") + telefone;
    }
}
