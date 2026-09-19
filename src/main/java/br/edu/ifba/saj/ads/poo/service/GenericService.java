package br.edu.ifba.saj.ads.poo.service;

import java.util.List;

import br.edu.ifba.saj.ads.poo.model.AbstractModel;
import br.edu.ifba.saj.ads.poo.model.Usuario;

public interface GenericService<T extends AbstractModel<ID>, ID> {
	ID salvar(T entidade, Usuario usuario) throws RegraDeNegocioException;
	void atualizar(T entidade, Usuario usuario) throws RegraDeNegocioException;
	void remover(ID id);
	void validar(T entidade) throws RegraDeNegocioException;

	List<T> buscarTodos(); // T buscarTodos();
	T buscarPorId(ID id) throws IllegalArgumentException;
}
