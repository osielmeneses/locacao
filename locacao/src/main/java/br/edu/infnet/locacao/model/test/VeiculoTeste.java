package br.edu.infnet.locacao.model.test;

import java.time.LocalDateTime;
import java.time.Month;

import br.edu.infnet.locacao.model.domain.Carro;
import br.edu.infnet.locacao.model.domain.Moto;

public class VeiculoTeste {

	public static void main(String[] args) {
		
		LocalDateTime dataInicio = LocalDateTime.of(2022, Month.APRIL, 20, 12, 30);
		LocalDateTime dataFim = LocalDateTime.of(2022, Month.APRIL, 30, 12, 30);
		
		Carro carro = new Carro("KVW9393", "Fiat Pálio", 30, 100);
		carro.setArCondicionado(true);
		carro.setArQuente(true);
		carro.setCambioAutomatico(false);
		carro.setTravaEletrica(true);
		carro.setDirecaoHidraulica(true);
		carro.setNumeroPortas(5);
		System.out.println(carro);
		System.out.println("Valor total: R$" + carro.calcularValorTotal(dataInicio, dataFim));
		
		Moto moto = new Moto("KVW9999", "Moto Yamaha", 20, 100);
		moto.setPontencia(150);
		System.out.println(moto);
		System.out.println("Valor total: R$" + moto.calcularValorTotal(dataInicio, dataFim));
	}
}