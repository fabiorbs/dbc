package br.com.frbs.desafio.dbc.dto;

import java.util.Date;

import br.com.frbs.desafio.dbc.models.Sessao;

public class SessaoDTO {
	private Integer tempoSessao;
	private Integer pautaId;

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

	public Sessao setEntity() {
		Sessao sessao = new Sessao();
		sessao.setInicioSessao(new Date());
		sessao.setTempoSessao(this.tempoSessao <= 0 ? 1 : this.tempoSessao);
		sessao.setPautaId(this.pautaId);

		return sessao;
	}

}
