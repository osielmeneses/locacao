package br.edu.infnet.locacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.locacao.model.domain.Carro;

@Service
public class CarroService {

private static Map<Integer, Carro> mapa = new HashMap<Integer, Carro>();
	
	private static Integer key = 1;

	public Collection<Carro> obterLista(){
		return mapa.values();
	}

	public void incluir(Carro carro) {
		carro.setId(key++);
		mapa.put(carro.getId(), carro);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}