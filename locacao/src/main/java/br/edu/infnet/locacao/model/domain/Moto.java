package br.edu.infnet.locacao.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.Entity;

@Entity
public class Moto extends Veiculo{

	private int pontencia;
	private String tipoPartida;
	
	public Moto() {
		// TODO Auto-generated constructor stub
	}
	
	public Moto(String placa, String modelo, float valorDiaria, long quilometragem) {
		super(placa, modelo, valorDiaria, quilometragem);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(pontencia);
		sb.append(";");
		sb.append(tipoPartida);
		
		return sb.toString();
	}
	
	public String getTipoPartida() {
		return tipoPartida;
	}

	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}

	public int getPontencia() {
		return pontencia;
	}

	public void setPontencia(int pontencia) {
		this.pontencia = pontencia;
	}

	@Override
	public float calcularValorTotal(LocalDate dataInicial, LocalDate dataFinal) {
		long dias = dataInicial.until(dataFinal, ChronoUnit.DAYS); 
		return (dias * getValorDiaria());
	}
}
