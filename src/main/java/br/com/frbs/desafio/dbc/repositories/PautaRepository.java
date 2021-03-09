package br.com.frbs.desafio.dbc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.frbs.desafio.dbc.models.Pauta;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, Integer> {
}
