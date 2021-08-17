package br.edu.infnet.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import br.edu.infnet.domain.model.Empresa;
import br.edu.infnet.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpresaController {

  @Autowired
  private EmpresaService empresaService;

  @GetMapping(value="/empresa")
  public String tela(){
      return "/empresa/cadastro";

  }

  @PostMapping(value="/empresa/incluir")
  public String incluir(Model model, Empresa empresa) {

      empresaService.incluir(empresa);

      model.addAttribute("mensagem", "Bem vindo(a) " + empresa.getRazaoSocial());

      return "/index";
  }
}