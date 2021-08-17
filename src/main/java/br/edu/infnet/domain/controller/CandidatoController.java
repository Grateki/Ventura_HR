package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.Candidato;
import br.edu.infnet.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;


    @GetMapping(value="/candidato")
    public String tela(){
        return "/candidato/cadastro";

    }

    @PostMapping(value="/candidato/incluir")
    public String incluir(Model model, Candidato candidato) {

        candidatoService.incluir(candidato);

        model.addAttribute("mensagem", "Bem vindo(a) " + candidato.getNome());

        return "/index";
    }
}