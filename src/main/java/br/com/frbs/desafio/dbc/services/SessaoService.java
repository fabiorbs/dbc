package br.com.frbs.desafio.dbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.frbs.desafio.dbc.dto.SessaoDTO;
import br.com.frbs.desafio.dbc.models.Sessao;
import br.com.frbs.desafio.dbc.repositories.SessaoRepository;

@Service
public class SessaoService {

	@Autowired
	public SessaoRepository repository;

	public Sessao abrirSessao(SessaoDTO sessaoDTO) {
		Sessao sessao = sessaoDTO.setEntity();
		return repository.save(sessao);
	}

	public List<Sessao> listarTodos() {
		return repository.findAll();
	}
}
