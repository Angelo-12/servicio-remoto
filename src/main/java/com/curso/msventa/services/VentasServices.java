package com.curso.msventa.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.msventa.remoto.dto.Categoria;
import com.curso.msventa.remoto.dto.Producto;

@FeignClient(value = "ventas",url = "http://localhost:8080")
public interface VentasServices {
	
	@RequestMapping(method = RequestMethod.GET,value = "/categorias")
	public List<Categoria> findAll();
	
	@RequestMapping(method = RequestMethod.GET, value = "/productos")
	public List<Producto> findAllProducts();
}
