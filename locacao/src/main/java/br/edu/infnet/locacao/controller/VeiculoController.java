package br.edu.infnet.locacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.service.VeiculoService;

@Controller
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping(value = "/veiculos")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("listagem", veiculoService.obterLista(usuario));
		
		return "veiculo/lista";
	}

	@GetMapping(value = "/veiculo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		veiculoService.excluir(id);
		
		return "redirect:/veiculos";
	}
}
