package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, Professor professor, LocalDate data) {
        super(titulo, descricao, professor);
        setData(data);
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  "Mentoria:\n" +
                "\ttitulo=" + getTitulo() + '\n' +
                "\tdescricao=" + getDescricao() + '\n' +
                "\tdata=" + data + '\n';
    }
}
