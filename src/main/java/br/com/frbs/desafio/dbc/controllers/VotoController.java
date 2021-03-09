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

import br.com.frbs.desafio.dbc.models.Voto;
import br.com.frbs.desafio.dbc.services.VotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "voto/", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Controller Voto")
public class VotoController {

	@Autowired
	public VotoService votoService;

	@GetMapping("Votos")
	@ApiOperation(value = "Listagem de Voto")
	public ResponseEntity<List<Voto>> listarTodosVoto() {
		return ResponseEntity.ok(votoService.listarTodos());
	}

	@PostMapping("cadastrar")
	@ApiOperation(value = "Cadastro de Voto")
	public ResponseEntity<Voto> cadastrarVoto(@RequestBody Voto Voto) {
		return ResponseEntity.ok(votoService.cadastrar(Voto));
	}

}
