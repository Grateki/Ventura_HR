package br.edu.infnet.domain.model;

import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;

public class Candidato extends Usuario{

    private String nome;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String cpf;
    private LocalDate dataNascimento;

    Candidato(){super();}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
