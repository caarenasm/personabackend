package xyz.carlosarenas.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.carlosarenas.persona.model.Departamento;
import xyz.carlosarenas.persona.service.DepartamentoService;

@RestController
@RequestMapping ("/departamentos/")
public class DepartamentoRest {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Departamento>> getAllDepartamentosByPais (@PathVariable("id") long idPais) {
		return ResponseEntity.ok(departamentoService.findAllByCount(idPais));
	}

}
