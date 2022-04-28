package br.edu.infnet.locacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.locacao.model.domain.Carro;
import br.edu.infnet.locacao.model.domain.Moto;
import br.edu.infnet.locacao.model.domain.Usuario;
import br.edu.infnet.locacao.model.service.CarroService;
import br.edu.infnet.locacao.model.service.MotoService;


@Order(3)
@Component
public class VeiculoLoader implements ApplicationRunner {

	@Autowired
	private CarroService carroService;
		
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Carro carro = new Carro("KYR9797", "Jeep Renegade", 120, 5000);
		carro.setArCondicionado(true);
		carro.setArQuente(true);
		carro.setCambioAutomatico(false);
		carro.setTravaEletrica(true);
		carro.setDirecaoHidraulica(true);
		carro.setNumeroPortas(5);
		carroService.incluir(carro);
	}
}
