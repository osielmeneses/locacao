package br.edu.infnet.locacao.model.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.locacao.model.domain.Moto;

public class MotoTeste {

	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate  dataInicio = LocalDate.parse("10/05/2022", df);
		LocalDate  dataFim = LocalDate.parse("15/05/2022", df);
		
		Moto moto = new Moto("KVW9393", "Moto Yamaha", 20, 100);
		moto.setPontencia(150);
		moto.setTipoPartida("Elétrica");
		System.out.println(moto);
		System.out.println("Valor total: R$" + moto.calcularValorTotal(dataInicio, dataFim));
	}
}
