package br.edu.infnet.locacao.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.locacao.model.repository.IVeiculoRepository;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.domain.Veiculo;


@Service
public class VeiculoService {

	@Autowired
	private IVeiculoRepository veiculoRepository;
	
	public Collection<Veiculo> obterLista(Usuario usuario) {
		return (Collection<Veiculo>) veiculoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "modelo"));
	}
	
	public void excluir(Integer id) {
		veiculoRepository.deleteById(id);
	}
	
	public Veiculo obterPorId(Integer id) {
		return veiculoRepository.findById(id).orElse(null);
	}
}
