package br.edu.ifba.saj.ads.poo.service;

import java.util.UUID;

import br.edu.ifba.saj.ads.poo.dao.GenericDAOImpl;
import br.edu.ifba.saj.ads.poo.model.Consulta;

public class ConsultaService extends GenericServiceImpl<Consulta, UUID> {

	public ConsultaService() {
		super(new GenericDAOImpl<>(UUID.class));
	}

	public void validarLimiteAgenda(Consulta consulta) throws ConsultaInvalidaException {
		for (Consulta c : buscarTodos()) {
			if (c.getDataHora() == consulta.getDataHora()
				&& c.getVeterinario() == consulta.getVeterinario())
			throw new ConsultaInvalidaException("Horário inválido.");
		}
	}

	public void validarLimiteDiario(Consulta consulta) throws LimiteConsultaException {
		int qtd = 0;
		for (Consulta c : buscarTodos()) {
			if (c.getAnimal() == consulta.getAnimal()) {
				qtd++;
			}
			if (qtd >= 2) {
				throw new LimiteConsultaException("Limite excedido.");
			}
		}
	}

	@Override
	public void validar(Consulta entidade) throws RegraDeNegocioException {
		validarLimiteAgenda(entidade);
		validarLimiteDiario(entidade);
	}
	
}
