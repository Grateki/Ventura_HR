package br.edu.infnet.service;

import br.edu.infnet.domain.model.Candidato;
import br.edu.infnet.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {

  @Autowired
  private CandidatoRepository candidatoRepository;

  public void incluir(Candidato candidato){

      candidatoRepository.save(candidato);

  }
}