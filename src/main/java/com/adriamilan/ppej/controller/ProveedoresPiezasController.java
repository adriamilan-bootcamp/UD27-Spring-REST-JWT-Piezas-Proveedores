package com.adriamilan.ppej.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.ppej.dto.ProveedoresPiezas;
import com.adriamilan.ppej.service.ProveedoresPiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedoresPiezasController {

	@Autowired
	ProveedoresPiezasServiceImpl ppservice;

	@GetMapping("/suministraciones")
	public List<ProveedoresPiezas> listProveedoresPiezas() {
		return ppservice.listProveedoresPiezas();
	}
	
	@GetMapping("/suministracion/{id}")
	public ProveedoresPiezas proveedoresPiezasXID(@PathVariable(name="id") Long id) {
		return ppservice.proovedoresPiezasXID(id);
	}
	
	@PostMapping("/suministracion")
	public ProveedoresPiezas saveProveedoresPiezas(@RequestBody ProveedoresPiezas proovedoresPiezas) {
		return ppservice.saveProveedoresPiezas(proovedoresPiezas);
	}
	
	@PutMapping("/suministracion/{id}")
	public ProveedoresPiezas editProovedoresPiezas(@PathVariable(name="id") Long id, @RequestBody ProveedoresPiezas proovedoresPiezas) {
		ProveedoresPiezas ppSelected = new ProveedoresPiezas();
		ProveedoresPiezas ppUpdated = new ProveedoresPiezas();
		
		ppSelected = ppservice.proovedoresPiezasXID(id);
		ppSelected.setPieza(proovedoresPiezas.getPieza());
		ppSelected.setProveedor(proovedoresPiezas.getProveedor());
		
		ppUpdated = ppservice.saveProveedoresPiezas(ppSelected);
		
		return ppUpdated;
	}
	
	@DeleteMapping("/suministracion/{id}")
	public void deleteProveedoresPiezas(@PathVariable(name="id") Long id) {
		ppservice.deletProovedoresPiezas(id);
	}
	
}
