package br.edu.infnet.locacao.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Locacao {

	private String descricao;
	private boolean locacaoWeb;
	private String localRetirada;
	private String localDevolucao;
	private LocalDateTime data;
	private LocalDateTime dataRetirada;
	private LocalDateTime dataDevolucao;
	private float valorLocacao;
	private List<Veiculo> veiculos;
	private Cliente cliente;
	
	public Locacao() {
		data = LocalDateTime.now();
		descricao = "Locação efetuada WebSite ou App";
		locacaoWeb = true;
	}

	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%s;%s;%s;%s;%s;%s;%s;%s;%d", 
				descricao, 
				localRetirada,
				localDevolucao,
				data.format(formato),
				dataRetirada.format(formato), 
				dataDevolucao.format(formato), 
				valorLocacao,
				locacaoWeb ? "internet" : "loja física", 
						veiculos.size());
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isLocacaoWeb() {
		return locacaoWeb;
	}

	public void setLocacaoWeb(boolean locacaoWeb) {
		this.locacaoWeb = locacaoWeb;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public LocalDateTime getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(LocalDateTime dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public String getLocalRetirada() {
		return localRetirada;
	}

	public void setLocalRetirada(String localRetirada) {
		this.localRetirada = localRetirada;
	}

	public String getLocalDevolucao() {
		return localDevolucao;
	}

	public void setLocalDevolucao(String localDevolucao) {
		this.localDevolucao = localDevolucao;
	}

	public float getValorLocacao() {
		return valorLocacao;
	}
	
	public void setValorLocacao(float valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
}
