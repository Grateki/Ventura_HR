package br.edu.infnet.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcessoController {
    @GetMapping(value = "/")
    public String login(){
        return "/login";
    }

    @GetMapping(value = "/candidato/registro")
    public String criaConta(){
        return "/candidato/registro";
    }

    @GetMapping(value ="/empresa/registro")
    public String empresa(){
        return "/empresa/registro";
    }


    public String registroAdministrador(){
        return "/administrador/registro";
    }
}