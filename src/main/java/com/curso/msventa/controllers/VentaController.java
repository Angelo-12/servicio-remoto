package com.curso.msventa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.msventa.remoto.dto.Categoria;
import com.curso.msventa.remoto.dto.Producto;
import com.curso.msventa.services.VentasServices;

@RestController
@RequestMapping("/ventas")
public class VentaController {

	@Autowired
	private VentasServices venta;
	
	@GetMapping
	public List<Categoria> findAll(){
		return venta.findAll();
	}
	
	@GetMapping("/productos")
	public List<Producto> findAllProducts(){
		return venta.findAllProducts();
	}
	
}
