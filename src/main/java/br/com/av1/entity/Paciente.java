package br.com.av1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String tipoSang;
	private String cpf;
	private String telefone;
	
	public Paciente() {}
	
	public Paciente(Integer id, String nome, String tipoSang, String cpf, String telefone) {
		
		this.id = id;
		this.nome = nome;
		this.tipoSang = tipoSang;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoSang() {
		return tipoSang;
	}
	public void setTipoSang(String tipoSang) {
		this.tipoSang = tipoSang;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
