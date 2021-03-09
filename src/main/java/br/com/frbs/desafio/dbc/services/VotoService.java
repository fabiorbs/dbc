package br.com.frbs.desafio.dbc.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.frbs.desafio.dbc.exceptions.BusinessException;
import br.com.frbs.desafio.dbc.models.Sessao;
import br.com.frbs.desafio.dbc.models.Voto;
import br.com.frbs.desafio.dbc.repositories.SessaoRepository;
import br.com.frbs.desafio.dbc.repositories.VotoRepository;

@Service
public class VotoService {

	@Autowired
	public VotoRepository repository;

	@Autowired
	public SessaoRepository sessaoRepository;

	public static final Integer MILISECONDS = 60000; 
	
	public Voto cadastrar(Voto voto) {

		Optional<Sessao> sessao = sessaoRepository.findById(voto.getSessaoId());

		if (sessao.isPresent()) {
			long inicioSessao = sessao.get().getInicioSessao().getTime();
			Date dataHoje = new Date();
			long fimSessao = dataHoje.getTime();
			long tempoTotal = fimSessao - inicioSessao;

			if (tempoTotal > (sessao.get().getTempoSessao() * MILISECONDS)) {
				throw new BusinessException("Tempo de votação finalizado");
			}
		}

		return repository.save(voto);
	}

	public List<Voto> listarTodos() {
		return repository.findAll();
	}
}
