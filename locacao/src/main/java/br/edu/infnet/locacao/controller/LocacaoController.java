package br.edu.infnet.locacao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.locacao.model.domain.Locacao;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.domain.Veiculo;
import br.edu.infnet.locacao.model.service.ClienteService;
import br.edu.infnet.locacao.model.service.LocacaoService;
import br.edu.infnet.locacao.model.service.VeiculoService;

@Controller
public class LocacaoController {

	@Autowired
	private LocacaoService locacaoService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping(value = "/locacao")
	public String cadastro(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("clientes", clienteService.obterLista(usuario));
		
		model.addAttribute("veiculos", veiculoService.obterLista(usuario));
		
		return "locacao/cadastro";
	}
	
	@GetMapping(value = "/locacoes")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("listagem", locacaoService.obterLista(usuario));
		
		return "locacao/lista";
	}

	@PostMapping(value = "/locacao/incluir") 
	public String incluir(Model model, Locacao locacao, @RequestParam String[] idsVeiculos, @SessionAttribute("usuarioLogado") Usuario usuario) {
		locacao.setUsuario(usuario);
				
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		for(String id : idsVeiculos) {
			
			Veiculo veiculo = veiculoService.obterPorId(Integer.valueOf(id));
			
			veiculos.add(veiculo);
		}
		
		locacao.setVeiculos(veiculos);
		locacao.setDescricao(locacao.getDescricao());
		locacao.setValorLocacao(locacao.getValorLocacao());
		locacaoService.incluir(locacao);

		return "redirect:/locacoes";
	}
	
	@GetMapping(value = "/locacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		locacaoService.excluir(id);
		
		return "redirect:/locacoes";
	}
}
