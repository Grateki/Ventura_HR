package br.edu.infnet.repository;

import br.edu.infnet.domain.model.Candidato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends CrudRepository {

	void save(Candidato candidato);
}