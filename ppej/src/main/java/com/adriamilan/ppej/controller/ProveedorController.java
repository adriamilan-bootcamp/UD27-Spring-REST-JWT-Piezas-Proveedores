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

import com.adriamilan.ppej.dto.Proveedor;
import com.adriamilan.ppej.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl pservice;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listProveedores() {
		return pservice.listProveedores();
	}
	
	@GetMapping("/proveedor/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id") Long id) {
		return pservice.proveedorXID(id);
	}
	
	@PostMapping("/proveedor")
	public Proveedor saveProveedor(@RequestBody Proveedor proveedor) {
		return pservice.saveProveedor(proveedor);
	}
	
	@PutMapping("/proveedor/{id}")
	public Proveedor editProveedor(@PathVariable(name="id") Long id, @RequestBody Proveedor proveedor) {
		Proveedor proveedorSelected = new Proveedor();
		Proveedor proveedorUpdated = new Proveedor();
		
		proveedorSelected = pservice.proveedorXID(id);
		proveedorSelected.setNombre(proveedor.getNombre());
		
		proveedorUpdated = pservice.saveProveedor(proveedorSelected);
		
		return proveedorUpdated;
	}
	
	@DeleteMapping("/proovedor/{id}")
	public void deleteProveedor(@PathVariable(name="id") Long id) {
		pservice.deleteProveedor(id);
	}
	
}
