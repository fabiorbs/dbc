package br.com.frbs.desafio.dbc.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Sessao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSessao;

	private Date inicioSessao;

	private Integer tempoSessao;

	private Integer pautaId;

	public Integer getIdSessao() {
		return idSessao;
	}

	public void setIdSessao(Integer idSessao) {
		this.idSessao = idSessao;
	}

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", locale = "pt-BR", timezone = "Brazil/East")
	public Date getInicioSessao() {
		return inicioSessao;
	}

	public void setInicioSessao(Date inicioSessao) {
		this.inicioSessao = inicioSessao;
	}

	public Integer getTempoSessao() {
		return tempoSessao;
	}

	public void setTempoSessao(Integer tempoSessao) {
		this.tempoSessao = tempoSessao;
	}

	public Integer getPautaId() {
		return pautaId;
	}

	public void setPautaId(Integer pautaId) {
		this.pautaId = pautaId;
	}

}
