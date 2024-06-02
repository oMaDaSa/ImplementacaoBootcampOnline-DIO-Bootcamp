package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Professor extends Pessoa{

    private Set<Conteudo> conteudos = new HashSet<>();

    public Professor(String nome) {
        super(nome);
    }

    public void adicionarConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(conteudos, professor.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudos);
    }


}
