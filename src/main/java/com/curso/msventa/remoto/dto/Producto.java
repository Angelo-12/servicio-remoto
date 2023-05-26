package com.curso.msventa.remoto.dto;

import java.io.Serializable;

public class Producto implements Serializable{
	private static final long serialVersionUID = -5613231152650382752L;
	private Long id;
	private String nombre;
	private String descripcion;
	private Double precio;
	private Categoria categoria;
	
	public Producto() {
	}
	public Producto(Long id, String nombre, String descripcion, Double precio, Categoria categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
