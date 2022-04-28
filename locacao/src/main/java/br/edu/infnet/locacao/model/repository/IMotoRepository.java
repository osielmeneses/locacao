package br.edu.infnet.locacao.model.repository;


import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.locacao.model.domain.Moto;

@Repository
public interface IMotoRepository extends CrudRepository<Moto, Integer> {
	@Query("from Moto m where m.usuario.id = :id")
	Collection<Moto> findAll(Integer id, Sort by);
}
