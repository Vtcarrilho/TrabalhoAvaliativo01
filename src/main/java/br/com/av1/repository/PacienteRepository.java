package br.com.av1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.av1.entity.Paciente;

@Repository
public interface PacienteRepository  extends JpaRepository<Paciente, Integer>{

	
}
