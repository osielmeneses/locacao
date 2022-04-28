package br.edu.infnet.locacao.model.repository;


import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.locacao.model.domain.Veiculo;

@Repository
public interface IVeiculoRepository extends CrudRepository<Veiculo, Integer> {
	@Query("from Veiculo v where v.usuario.id = :id")
	Collection<Veiculo> findAll(Integer id, Sort by);
}
