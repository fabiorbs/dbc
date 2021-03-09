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

import br.com.frbs.desafio.dbc.models.Pauta;
import br.com.frbs.desafio.dbc.services.PautaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "pauta/", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Controller Pauta")
public class PautaController {

	@Autowired
	public PautaService pautaService;

	@GetMapping("pautas")
	@ApiOperation(value = "Listagem de pauta")
	public ResponseEntity<List<Pauta>> listarTodosPauta() {
		return ResponseEntity.ok(pautaService.listarTodos());
	}

	@PostMapping("cadastrar")
	@ApiOperation(value = "Cadastro de pauta")
	public ResponseEntity<Pauta> cadastrarPauta(@RequestBody Pauta Pauta) {
		return ResponseEntity.ok(pautaService.cadastrar(Pauta));
	}

}
