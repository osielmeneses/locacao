package br.edu.infnet.locacao.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	public Usuario validar(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public Collection<Usuario> obterLista() {
		return (Collection<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
}
