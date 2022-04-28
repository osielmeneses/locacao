package br.edu.infnet.locacao.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.locacao.model.domain.Carro;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.repository.ICarroRepository;

@Service
public class CarroService {

	@Autowired
	private ICarroRepository carroRepository;
   
	public Collection<Carro> obterLista(Usuario usuario) {
		return (Collection<Carro>) carroRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "id"));
	}
	
	public void incluir(Carro carro) {
		carroRepository.save(carro);
	}
	
	public void excluir(Integer id) {
		carroRepository.deleteById(id);
	}
}
