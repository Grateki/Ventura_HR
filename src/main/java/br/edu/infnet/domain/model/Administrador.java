package br.edu.infnet.domain.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Administrador extends Usuario{

    private String nome;
    

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataNascimento;
    private String venturaId;
}
