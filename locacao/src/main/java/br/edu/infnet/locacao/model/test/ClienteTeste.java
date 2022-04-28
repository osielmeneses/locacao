package br.edu.infnet.locacao.model.test;

import br.edu.infnet.locacao.model.domain.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Osiel Meneses", "02566688509", "199988899", "B", "21979172555", "osielmeneses@gmail.com");
		System.out.println(cliente);
	}
}
