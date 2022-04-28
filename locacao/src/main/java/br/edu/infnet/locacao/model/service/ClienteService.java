package br.edu.infnet.locacao.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import br.edu.infnet.locacao.model.domain.Cliente;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.repository.IClienteRepository;


@Service
public class ClienteService {

	@Autowired
	private IClienteRepository clienteRepository;
	
	public Collection<Cliente> obterLista(Usuario usuario){
		return (Collection<Cliente>) clienteRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}
}
