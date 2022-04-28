package br.edu.infnet.locacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.locacao.model.domain.Cliente;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.service.ClienteService;

@Order(2)
@Component
public class ClienteLoader  implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Cliente cliente = new Cliente("Cliente especial", "02566698827", "987815545", "B", "21979172555", "cliente@email.com");
		cliente.setUsuario(usuario);
		clienteService.incluir(cliente);
	}
}
