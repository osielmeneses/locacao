package br.edu.infnet.locacao.model.domain;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Moto extends Veiculo{

	private int pontencia;
	
	public Moto(String placa, String modelo, float valorDiaria, long quilometragem) {
		super(placa, modelo, valorDiaria, quilometragem);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(pontencia);
		
		return sb.toString();
	}
	
	public int getPontencia() {
		return pontencia;
	}

	public void setPontencia(int pontencia) {
		this.pontencia = pontencia;
	}

	@Override
	public float calcularValorTotal(LocalDateTime dataInicial, LocalDateTime dataFinal) {
		long dias = dataInicial.until(dataFinal, ChronoUnit.DAYS); 
		return (dias * getValorDiaria());
	}
}
