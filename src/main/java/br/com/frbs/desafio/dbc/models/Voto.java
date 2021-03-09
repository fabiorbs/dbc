package br.com.frbs.desafio.dbc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVoto;

	private Integer sessaoId;

	private Integer associadoId;

	private String voto;

	public Integer getIdVoto() {
		return idVoto;
	}

	public void setIdVoto(Integer idVoto) {
		this.idVoto = idVoto;
	}

	public Integer getSessaoId() {
		return sessaoId;
	}

	public void setSessaoId(Integer sessaoId) {
		this.sessaoId = sessaoId;
	}

	public Integer getAssociadoId() {
		return associadoId;
	}

	public void setAssociadoId(Integer associadoId) {
		this.associadoId = associadoId;
	}

	public String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}

}
