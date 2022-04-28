package br.edu.infnet.locacao.model.repository;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.locacao.model.domain.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer> {
	@Query("from Cliente c where c.usuario.id = :id")
	List<Cliente> findAll(Integer id, Sort by);
}
