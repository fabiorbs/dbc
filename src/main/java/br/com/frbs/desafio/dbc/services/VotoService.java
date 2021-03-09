package br.com.frbs.desafio.dbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.frbs.desafio.dbc.models.Voto;
import br.com.frbs.desafio.dbc.repositories.VotoRepository;

@Service
public class VotoService {

	@Autowired
	public VotoRepository repository;

	public Voto cadastrar(Voto voto) {
		return repository.save(voto);
	}

	public List<Voto> listarTodos() {
		return repository.findAll();
	}
}
