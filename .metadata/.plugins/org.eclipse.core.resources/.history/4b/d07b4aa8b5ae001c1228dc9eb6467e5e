package br.edu.infnet.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.dominio.Administrativo;
import br.edu.infnet.dominio.Contato;
import br.edu.infnet.dominio.Empresa;
import br.edu.infnet.dominio.Funcionario;
import br.edu.infnet.dominio.Programador;

public class EmpresaTeste {

	public static void main(String[] args) {

		Contato cont1 = new Contato();
		cont1.setEmail("elberth@elberth.com");
		cont1.setTelefone("123123123");

		Administrativo adm1 = new Administrativo();
		adm1.setNome("elberth");
		adm1.setIdade(43);
		adm1.setSalario(1000);
		adm1.setBonus(300);
		adm1.setDesconto(500);
		adm1.setContato(cont1);
		
		Contato cont2 = new Contato();
		cont2.setEmail("hugo@hugo.com");
		cont2.setTelefone("234234234");

		Programador prog1 = new Programador();
		prog1.setNome("huguinho");
		prog1.setIdade(43);
		prog1.setSalario(1000);
		prog1.setFullStack(true);
		prog1.setLinguagem("java");
		prog1.setContato(cont2);

		Contato cont3 = new Contato();
		cont3.setEmail("moraes@moraes.com");
		cont3.setTelefone("987987987");

		Administrativo adm2 = new Administrativo();
		adm2.setNome("moraes");
		adm2.setIdade(86);
		adm2.setSalario(2000);
		adm2.setBonus(600);
		adm2.setDesconto(1000);
		adm2.setContato(cont3);
		
		Contato cont4 = new Contato();
		cont4.setEmail("hugo@hugo.com");
		cont4.setTelefone("234234234");

		Programador prog2 = new Programador();
		prog2.setNome("zezinho");
		prog2.setIdade(22);
		prog2.setSalario(250);
		prog2.setFullStack(true);
		prog2.setLinguagem("java");
		prog2.setContato(cont4);
		
		List<Funcionario> colecaoFuncionarios = new ArrayList<Funcionario>();
		colecaoFuncionarios.add(adm1);
		colecaoFuncionarios.add(adm2);
		colecaoFuncionarios.add(prog2);
		colecaoFuncionarios.add(prog2);

		Contato contato = new Contato();
		contato.setEmail("emp@emp.com");
		contato.setTelefone("23123123");
		
		Empresa empresa = new Empresa();
		empresa.setEndereco("rua da empresa, 10");
		empresa.setRazaoSocial("empresa do elberth");
		
		empresa.setContato(contato);
		
		empresa.setFuncionarios(colecaoFuncionarios);

		System.out.println(empresa);		
	}
}
