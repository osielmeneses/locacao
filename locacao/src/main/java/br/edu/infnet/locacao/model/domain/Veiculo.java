package br.edu.infnet.locacao.model.domain;

import java.time.LocalDateTime;

public abstract class Veiculo {
	
	private Integer id;
	private String placa;
	private String modelo;
	private float valorDiaria;
	private long quilometragem;
	
	
	public Veiculo(String placa, String modelo, float valorDiaria, long quilometragem) {
		this.placa = placa;
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
		this.quilometragem = quilometragem;
	}
	
	public abstract float calcularValorTotal(LocalDateTime dataInicial, LocalDateTime dataFinal);

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(placa);
		sb.append(";");
		sb.append(modelo);
		sb.append(";");
		sb.append(valorDiaria);
		sb.append(";");
		sb.append(quilometragem);
		
		return sb.toString();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public long getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(long quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}