package br.edu.infnet.locacao.model.repository;


import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.locacao.model.domain.Locacao;

@Repository
public interface ILocacaoRepository extends CrudRepository<Locacao, Integer> {
	@Query("from Locacao l where l.usuario.id = :id")
	Collection<Locacao> findAll(Integer id, Sort by);
	
	Collection<Locacao> findAll(Sort by);
}
