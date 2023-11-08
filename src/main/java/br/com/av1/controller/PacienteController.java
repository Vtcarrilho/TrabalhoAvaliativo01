package br.com.av1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.av1.entity.Paciente;
import br.com.av1.service.PacienteService;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

	@Autowired
	private PacienteService service;
	
	@GetMapping
	public List<Paciente> procuraTodos(){
		List<Paciente> listaDePaciente = service.procuraTodos();
		return listaDePaciente;
	}
	
	@GetMapping(value = "/{id}")
	public Paciente procuraPorId(@PathVariable Integer id) {
	Paciente response = service.procuraPorId(id);
	return response;
	}
	
	@PostMapping
	public String adicionarPaciente(@RequestBody Paciente paciente ) {
	String response = service.adicionaPaciente(paciente);
	return response;
	}
	
	@PutMapping(value = "/{id}")
	public String editarPaciente(@PathVariable Integer id, @RequestBody Paciente paciente ) {
	String response = service.editarPaciente(id, paciente);
	return response;
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluirPaciente(@PathVariable Integer id) {
		service.excluirPaciente(id);
	}
	
}
