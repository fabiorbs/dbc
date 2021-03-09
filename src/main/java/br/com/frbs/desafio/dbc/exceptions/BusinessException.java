package br.com.frbs.desafio.dbc.exceptions;

public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = -587707120572448287L;

	public BusinessException(String message) {
		super(message);
	}
}
