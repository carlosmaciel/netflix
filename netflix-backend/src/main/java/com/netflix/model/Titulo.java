package com.netflix.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "titulo")
public class Titulo {
		    		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@Column
	private String capa;
	
	@Column
	private String nome;
	
	@Column
	private String relevancia;
	
	@Column
	private Integer idade;
	
	@Column
	private Integer partes;
		
	@ManyToOne
	@JoinColumn(name = "secao_id")
	@JsonIgnore
	private Secao secao;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRelevancia() {
		return relevancia;
	}

	public void setRelevancia(String relevancia) {
		this.relevancia = relevancia;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getPartes() {
		return partes;
	}

	public void setPartes(Integer partes) {
		this.partes = partes;
	}
	
	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}
	
}
