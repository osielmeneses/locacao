package br.edu.infnet.locacao.model.test;

import java.time.LocalDateTime;
import java.time.Month;

import br.edu.infnet.locacao.model.domain.Moto;

public class MotoTeste {

	public static void main(String[] args) {
		
		LocalDateTime dataInicio = LocalDateTime.of(2022, Month.APRIL, 20, 12, 30);
		LocalDateTime dataFim = LocalDateTime.of(2022, Month.APRIL, 30, 12, 30);
		
		Moto moto = new Moto("KVW9393", "Moto Yamaha", 20, 100);
		moto.setPontencia(150);
		System.out.println(moto);
		System.out.println("Valor total: R$" + moto.calcularValorTotal(dataInicio, dataFim));
	}
}
