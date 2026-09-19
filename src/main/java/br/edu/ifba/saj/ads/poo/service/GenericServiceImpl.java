package br.edu.ifba.saj.ads.poo.service;

import java.util.List;

import br.edu.ifba.saj.ads.poo.dao.GenericDAO;
import br.edu.ifba.saj.ads.poo.model.AbstractModel;
import br.edu.ifba.saj.ads.poo.model.Usuario;

public abstract class GenericServiceImpl<T extends AbstractModel<ID>, ID> implements GenericService<T, ID> {
	
	private GenericDAO<T, ID> dao;
	
	public GenericServiceImpl(GenericDAO<T, ID> dao) { // não lembro mas provavelmente não foi assim
		this.dao = dao;
	}
	
    @Override
    public ID salvar(T entidade, Usuario usuario) throws RegraDeNegocioException {
        validar(entidade);
		return dao.salvar(entidade, usuario);
    }

    @Override
    public void atualizar(T entidade, Usuario usuario) throws RegraDeNegocioException {
        validar(entidade);
		dao.atualizar(entidade, usuario);
    }

	// implicitos ("todos os restantes chamam o dao")
    @Override
    public void remover(ID id) {
        dao.remover(id);
    }

    @Override
    public List<T> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public T buscarPorId(ID id) throws IllegalArgumentException {
        return dao.buscarPorId(id);
    }
	
}
