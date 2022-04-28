package br.edu.infnet.locacao.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import br.edu.infnet.locacao.model.domain.Locacao;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.repository.ILocacaoRepository;

@Service
public class LocacaoService {


	@Autowired
	private ILocacaoRepository locacaoRepository;

	public Collection<Locacao> obterLista(Usuario usuario){
		return locacaoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "data"));
	}

	public Collection<Locacao> obterLista(){
		return locacaoRepository.findAll(Sort.by(Sort.Direction.ASC, "data"));
	}

	public void incluir(Locacao locacao) {
		locacaoRepository.save(locacao);
	}

	public void excluir(Integer id) {
		locacaoRepository.deleteById(id);
	}

	public Locacao obterPorId(Integer id) {
		return locacaoRepository.findById(id).orElse(null);
	}
}
