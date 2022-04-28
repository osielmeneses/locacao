package br.edu.infnet.locacao.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Locacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private String localRetirada;
	private String localDevolucao;
	private LocalDateTime data;
	private String dataRetirada;
	private String dataDevolucao;
	private float valorLocacao;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Veiculo> veiculos;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
		
	public Locacao() {
		this.data = LocalDateTime.now();
	}

	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%s;%s;%s;%s;%s;%s;%s;%d", 
				descricao, 
				localRetirada,
				localDevolucao,
				data.format(formato),
				dataRetirada, 
				dataDevolucao, 
				valorLocacao,
			veiculos.size());
	}
	
	public String getDescricao() {
		if(descricao != null)
			return descricao;
		
		descricao = "";
		for (Veiculo veiculo : veiculos) {
			descricao += " | " + veiculo.getModelo() ;
		}	
		
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public String getLocalRetirada() {
		return localRetirada;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
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
		if(valorLocacao > 0)
			return valorLocacao;
		
		for (Veiculo veiculo : veiculos) {
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate  dataInicio = LocalDate.parse(getDataRetirada(), df);
			LocalDate  dataFim = LocalDate.parse(getDataDevolucao(), df);
	        
			valorLocacao += veiculo.calcularValorTotal(dataInicio, dataFim);
		}	
		
		return valorLocacao;
	}
	
	public void setValorLocacao(float valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
