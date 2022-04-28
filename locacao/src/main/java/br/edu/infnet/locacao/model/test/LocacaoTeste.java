package br.edu.infnet.locacao.model.test;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.Month;


import br.edu.infnet.locacao.model.domain.Carro;
import br.edu.infnet.locacao.model.domain.Cliente;
import br.edu.infnet.locacao.model.domain.Locacao;
import br.edu.infnet.locacao.model.domain.Veiculo;

public class LocacaoTeste {

	public static void main(String[] args) {
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		Locacao locacao = new Locacao();
		locacao.setLocalRetirada("Rio de Janeiro - Tijuca");
		locacao.setLocalDevolucao("Rio de Janeiro - Aeroporto");
		locacao.setDataRetirada("10/05/2022");
		locacao.setDataDevolucao("11/05/2022");
		
		for (int i = 0; i < 5; i++) {
			Carro veiculo = new Carro("KVW9393" + i, "Fiat Pálio", 20, 100);
			veiculos.add(veiculo);
		}
		
		Cliente cliente = new Cliente("Osiel Meneses",  "02566688509", "199988899", "B", "21979172555", "osielmeneses@gmail.com");
		
		locacao.setVeiculos(veiculos);
		locacao.setCliente(cliente);
		locacao.getDescricao();
		locacao.getValorLocacao();
		System.out.println(locacao);
		
		System.out.println(cliente);
		
		System.out.println(veiculos);
	}
}
