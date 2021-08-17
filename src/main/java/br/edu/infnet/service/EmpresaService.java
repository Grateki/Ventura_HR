package br.edu.infnet.service;
import br.edu.infnet.domain.model.Empresa;
import br.edu.infnet.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public void incluir(Empresa empresa){

        empresaRepository.save(empresa);
    }
}