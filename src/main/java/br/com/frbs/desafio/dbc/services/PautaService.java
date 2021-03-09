package br.com.frbs.desafio.dbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.frbs.desafio.dbc.models.Pauta;
import br.com.frbs.desafio.dbc.repositories.PautaRepository;

@Service
public class PautaService {
	
	@Autowired
	public PautaRepository repository;

	public Pauta cadastrar(Pauta pauta) {
		return repository.save(pauta);
	}

	public List<Pauta> listarTodos() {
		return repository.findAll();
	}

}
