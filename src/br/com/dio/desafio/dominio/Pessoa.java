package br.com.dio.desafio.dominio;

public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
