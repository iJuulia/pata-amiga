package br.edu.ifba.saj.ads.poo.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import br.edu.ifba.saj.ads.poo.model.AbstractModel;
import br.edu.ifba.saj.ads.poo.model.Usuario;

public class GenericDAOImpl<T extends AbstractModel<ID>, ID> implements GenericDAO<T, ID> {

	private HashMap<ID, T> bancoDeDados = new HashMap<>(); // quase isso (não coloquei o new)
	private final Class<ID> idClass; // faltou

	public GenericDAOImpl(Class<ID> idClass) { // Class<ID>
		this.idClass = idClass; // this.bancoDeDados = new HashMap<ID, T>()
	}

	@Override
	public ID salvar(T entidade, Usuario usuario) {
		ID idCriado = (ID) UUID.randomUUID(); // implicito
		entidade.setId(idCriado); // faltou
		entidade.setCreatedAt(LocalDateTime.now());
		entidade.setCreatedBy(usuario);
		bancoDeDados.put(idCriado, entidade); // faltou
		return idCriado;
	}

	@Override
	public void atualizar(T entidade, Usuario usuario) {
		// busca por ID da entidade no bancoDeDados -- implicito
		entidade.setUpdatedAt(LocalDateTime.now());
		entidade.setUpdatedBy(usuario);
		bancoDeDados.put(entidade.getId(), entidade); // faltou
	}

	@Override
	public void remover(ID id) {
		bancoDeDados.remove(id);
	}

	@Override
	public List<T> buscarTodos() {
		return new ArrayList<>(bancoDeDados.values()); // return bancoDeDados.getAll()
	}

	@Override
	public T buscarPorId(ID id) throws IllegalArgumentException {
		var idEncontrado = bancoDeDados.get(id);
		if (idEncontrado == null)
			throw new IllegalArgumentException();
		return idEncontrado;
	}
	
}
