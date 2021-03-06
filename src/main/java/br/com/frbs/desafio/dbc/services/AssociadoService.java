package br.com.frbs.desafio.dbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.frbs.desafio.dbc.models.Associado;
import br.com.frbs.desafio.dbc.repositories.AssociadoRepository;

@Service
public class AssociadoService {

	@Autowired
	public AssociadoRepository repository;

	public Associado cadastrar(Associado associado) {
		return repository.save(associado);
	}

	public List<Associado> listarTodos() {
		return repository.findAll();
	}

}
