package br.edu.infnet.locacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.domain.Moto;
import br.edu.infnet.locacao.model.service.MotoService;

@Controller
public class MotoController {

	@Autowired
	private MotoService motoService;
	
	@GetMapping(value = "/moto")
	public String cadastro() {
		return "moto/cadastro";
	}
	
	@GetMapping(value = "/motos")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("listagem", motoService.obterLista(usuario));
		return "moto/lista";
	}

	@PostMapping(value = "/moto/incluir") 
	public String incluir(Model model, Moto moto, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		moto.setUsuario(usuario);
		motoService.incluir(moto);

		return "redirect:/motos";
	}
	
	@GetMapping(value = "/moto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		motoService.excluir(id);
		
		return "redirect:/motos";
	}
}
