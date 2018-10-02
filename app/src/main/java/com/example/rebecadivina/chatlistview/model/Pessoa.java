package com.example.rebecadivina.chatlistview.model;

import java.io.Serializable;

public class Pessoa implements Serializable{

    private String nome;
    private int idade;
    private int imagem;
    private String email;
    private String senha;

    public Pessoa(String nome, int idade, int imagem, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.imagem = imagem;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
