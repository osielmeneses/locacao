package br.edu.infnet.locacao.model.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.locacao.model.domain.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate  dataInicio = LocalDate.parse("10/05/2022", df);
		LocalDate  dataFim = LocalDate.parse("15/05/2022", df);
		
		Carro carro = new Carro("KVW9393", "Fiat Pálio", 10, 100);
		carro.setArCondicionado(true);
		carro.setArQuente(true);
		carro.setCambioAutomatico(false);
		carro.setTravaEletrica(true);
		carro.setDirecaoHidraulica(true);
		carro.setNumeroPortas(5);
		System.out.println(carro);
		System.out.println("Valor total: R$" + carro.calcularValorTotal(dataInicio, dataFim));
	}
}
