package br.edu.infnet.locacao.model.domain;

public class Cliente {

	private String nome;
	private String cpf;
	private String cnh;
	private String telefone;
	private String email;
	
	public Cliente(String nome, String cpf, String cnh, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
		this.telefone = telefone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(cnh);
		sb.append(";");
		sb.append(telefone);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
}
