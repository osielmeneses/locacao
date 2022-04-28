package br.edu.infnet.locacao.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.locacao.model.domain.Moto;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.repository.IMotoRepository;

@Service
public class MotoService {

	@Autowired
	private IMotoRepository motoRepository;
   
	public Collection<Moto> obterLista(Usuario usuario) {
		return (Collection<Moto>) motoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "id"));
	}
	
	public void incluir(Moto moto) {
		motoRepository.save(moto);
	}
	
	public void excluir(Integer id) {
		motoRepository.deleteById(id);
	}
}
