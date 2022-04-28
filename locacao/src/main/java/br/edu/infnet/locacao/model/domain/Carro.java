package br.edu.infnet.locacao.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.Entity;

@Entity
public class Carro extends Veiculo {

	private boolean arCondicionado;
	private boolean arQuente;
	private boolean cambioAutomatico;
	private boolean travaEletrica;
	private boolean direcaoHidraulica;
	private int numeroPortas;

	public Carro() {
		// TODO Auto-generated constructor stub
	}
	
	public Carro(String placa, String modelo, float valorDiaria, long quilometragem) {
		super(placa, modelo, valorDiaria, quilometragem);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(arCondicionado ? "Com ar condicionado" : "Sem ar condicionado");
		sb.append(";");
		sb.append(arQuente ? "Com ar quente" : "Sem ar quente ");
		sb.append(";");
		sb.append(cambioAutomatico ? "Com cambio automático" : "Sem cambio automático");
		sb.append(";");
		sb.append(travaEletrica ? "Com trava elétrica" : "Sem trava elétrica");
		sb.append(";");
		sb.append(direcaoHidraulica ? "Com direcao hidráulica" : "Sem direcao hidráulica");
		sb.append(";");
		sb.append(numeroPortas);
		
		return sb.toString();
	}
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public boolean isArQuente() {
		return arQuente;
	}
	public void setArQuente(boolean arQuente) {
		this.arQuente = arQuente;
	}
	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}
	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	public boolean isTravaEletrica() {
		return travaEletrica;
	}
	public void setTravaEletrica(boolean travaEletrica) {
		this.travaEletrica = travaEletrica;
	}
	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}
	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}
	
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	@Override
	public float calcularValorTotal(LocalDate dataInicial, LocalDate dataFinal) {
		long dias = dataInicial.until(dataFinal, ChronoUnit.DAYS); 
		return (dias * getValorDiaria());
	}	
}
