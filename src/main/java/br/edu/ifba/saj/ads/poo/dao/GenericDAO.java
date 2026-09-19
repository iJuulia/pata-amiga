package br.edu.ifba.saj.ads.poo.dao;

import java.util.List;

import br.edu.ifba.saj.ads.poo.model.AbstractModel;
import br.edu.ifba.saj.ads.poo.model.Usuario;

public interface GenericDAO<T extends AbstractModel<ID>, ID> {
	ID salvar(T entidade, Usuario usuario);
	void atualizar(T entidade, Usuario usuario);
	void remover(ID id);
	
	List<T> buscarTodos(); // T buscarTodos();
	T buscarPorId(ID id) throws IllegalArgumentException;
}
