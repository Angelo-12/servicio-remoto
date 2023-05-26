package com.curso.msventa.remoto.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Categoria implements Serializable{
	
	private static final long serialVersionUID = 755454065932240771L;
	private Long id;
	private String categoria;
	
	
	public Categoria() {
	}
	public Categoria(Long id, String categoria) {
		super();
		this.id = id;
		this.categoria = categoria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
