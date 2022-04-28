package br.edu.infnet.locacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.locacao.model.domain.Cliente;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/cliente")
	public String cadastro() {
		return "cliente/cadastro";
	}
	
	
	@GetMapping(value = "/clientes")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("listagem", clienteService.obterLista(usuario));

		return "cliente/lista";
	}
	
	@PostMapping(value = "/cliente/incluir") 
	public String incluir(Model model, Cliente cliente, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		cliente.setUsuario(usuario);
		clienteService.incluir(cliente);

		return "redirect:/clientes";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		clienteService.excluir(id);
		
		return "redirect:/clientes";
	}
}
