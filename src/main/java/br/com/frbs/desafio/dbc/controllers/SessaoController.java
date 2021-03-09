package br.com.frbs.desafio.dbc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.frbs.desafio.dbc.dto.SessaoDTO;
import br.com.frbs.desafio.dbc.models.Sessao;
import br.com.frbs.desafio.dbc.services.SessaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "sessao/", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Controller Sessao")
public class SessaoController {

	@Autowired
	public SessaoService sessaoService;

	@GetMapping("sessoes")
	@ApiOperation(value = "Listagem de sessão")
	public ResponseEntity<List<Sessao>> listarTodosPauta() {
		return ResponseEntity.ok(sessaoService.listarTodos());
	}

	@PostMapping("abertura")
	@ApiOperation(value = "Abertura de sessao")
	public ResponseEntity<Sessao> cadastrarSessao(@RequestBody SessaoDTO sessao) {
		return ResponseEntity.ok(sessaoService.abrirSessao(sessao));
	}

}
