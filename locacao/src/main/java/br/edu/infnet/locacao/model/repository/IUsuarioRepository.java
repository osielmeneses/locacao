package br.edu.infnet.locacao.model.repository;


import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.locacao.model.domain.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {

	@Query("from Usuario u where email = :email and senha = :senha")
	Usuario autenticacao(String email, String senha);

	Collection<Usuario> findAll(Sort by);
}
