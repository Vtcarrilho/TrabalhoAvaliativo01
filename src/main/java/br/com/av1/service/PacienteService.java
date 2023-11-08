package br.com.av1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.av1.entity.Paciente;
import br.com.av1.repository.PacienteRepository;


@Service
public class PacienteService {

	@Autowired
	private PacienteRepository repository;
	
	public List<Paciente> procuraTodos(){
		return repository.findAll();
		}
	
	public Paciente procuraPorId(Integer id) {
		return repository.findById(id).get();
	}
	
	public String adicionaPaciente(Paciente paciente) {
		repository.save(paciente);
		return "Paciente adicionado com sucesso!";
	}
	
	public String editarPaciente(Integer id, Paciente paciente) {
	       Paciente response = repository.findById(id).get();
	       response.setNome(paciente.getNome());
	       response.setTipoSang(paciente.getTipoSang());
	       response.setCpf(paciente.getCpf());
	       response.setTelefone(paciente.getTelefone());
	       
	       repository.save(response);
	       return"Usuário editado com sucesso";
	}
	
	public void excluirPaciente(Integer id) {
		Paciente response = repository.findById(id).get();
		repository.delete(response);
	}
}
