package com.netflix.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "secao")
public class Secao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column(name = "nome_chave")
	@JsonIgnore
	private String nomeChave;

	@OneToMany(mappedBy="secao")
	private Set<Titulo> titulos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeChave() {
		return nomeChave;
	}

	public void setNomeChave(String nomeChave) {
		this.nomeChave = nomeChave;
	}

	public Set<Titulo> getTitulos() {
		return titulos;
	}

	public void setTitulos(Set<Titulo> titulos) {
		this.titulos = titulos;
	}
	
}
