package br.edu.infnet.locacao.model.repository;


import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import br.edu.infnet.locacao.model.domain.Carro;

@Repository
public interface ICarroRepository extends CrudRepository<Carro, Integer> {
	@Query("from Carro c where c.usuario.id = :id")
	Collection<Carro> findAll(Integer id, Sort by);
}
