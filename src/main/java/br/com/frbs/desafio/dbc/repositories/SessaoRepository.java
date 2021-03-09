package br.com.frbs.desafio.dbc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.frbs.desafio.dbc.models.Sessao;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Integer> {
}
