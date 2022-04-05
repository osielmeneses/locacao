package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Constante;

public abstract class Funcionario {
	private String nome;
	private int idade;
	private float salario;
	private Contato contato;
	
	public Funcionario() {
		this.nome = Constante.NOME_PADRAO;
		this.idade = Constante.IDADE_PADRAO;
		this.salario = Constante.VALOR_PADRAO;
	}
	
	public Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(String nome, int idade, float salario) {
		this(nome, idade);
		this.salario = salario;
	}
	
	private String obterSituacao(float sl){

		if(sl >= Constante.VALOR_LIMITE) {
			return Constante.SITUACAO_RICO;
		} else if (sl >= 50000) {
			return "Classe média";
		} else {
			return Constante.SITUACAO_POBRE;
		}
	}
		
	protected abstract float calcularSalarioLiquido();
	
	public void impressao(){
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);
		
		System.out.println("O funcionário: " + this);
		System.out.println("Salário líquido: " + salarioLiquido);
		System.out.println("Situação: " + situacao);
	}
	
	@Override
	public String toString() {
		return nome + ";" + idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
}