package br.edu.infnet.locacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.domain.Carro;
import br.edu.infnet.locacao.model.service.CarroService;


@Controller
public class CarroController {

	@Autowired
	private CarroService carroService;
	
	@GetMapping(value = "/carro")
	public String cadastro() {
		return "carro/cadastro";
	}
	
	@GetMapping(value = "/carros")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("listagem", carroService.obterLista(usuario));
		return "carro/lista";
	}

	@PostMapping(value = "/carro/incluir") 
	public String incluir(Model model, Carro carro, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		carro.setUsuario(usuario);
		carroService.incluir(carro);

		return "redirect:/carros";
	}
	
	@GetMapping(value = "/carro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		carroService.excluir(id);
		
		return "redirect:/carros";
	}
}
