package br.edu.infnet.locacao.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String placa;
	private String modelo;
	private float valorDiaria;
	private long quilometragem;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@ManyToMany(mappedBy = "veiculos")
	private List<Locacao> locacoes;
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}
	
	public Veiculo(String placa, String modelo, float valorDiaria, long quilometragem) {
		this.placa = placa;
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
		this.quilometragem = quilometragem;
	}
	
	public abstract float calcularValorTotal(LocalDate dataInicial, LocalDate dataFinal);

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
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
}
