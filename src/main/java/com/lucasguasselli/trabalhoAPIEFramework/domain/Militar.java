package com.lucasguasselli.trabalhoAPIEFramework.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Militar implements Serializable {	
	 
	private static final long serialVersionUID = 4L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String posto;
	
	public Militar() {
		
	}
	
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
	public String getPosto() {
		return posto;
	}
	public void setPosto(String posto) {
		this.posto = posto;
	}
	
	
}
