  
package br.edu.infnet.repository;

import br.edu.infnet.domain.model.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepository  extends CrudRepository {

	void save(Empresa empresa);
}