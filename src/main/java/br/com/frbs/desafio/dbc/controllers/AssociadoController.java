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

import br.com.frbs.desafio.dbc.models.Associado;
import br.com.frbs.desafio.dbc.services.AssociadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "associado/", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Controller Associado")
public class AssociadoController {

	@Autowired
	public AssociadoService associadoService;

	@GetMapping("associados")
	@ApiOperation(value = "Listagem de Associado")
	public ResponseEntity<List<Associado>> listarTodosAssociado() {
		return ResponseEntity.ok(associadoService.listarTodos());
	}

	@PostMapping("cadastrar")
	@ApiOperation(value = "Cadastro de Associado")
	public ResponseEntity<Associado> cadastrarAssociado(@RequestBody Associado associado) {
		return ResponseEntity.ok(associadoService.cadastrar(associado));
	}

}
