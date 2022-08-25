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

import com.adriamilan.ppej.dto.Pieza;
import com.adriamilan.ppej.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl pservice;
	
	@GetMapping("/piezas")
	public List<Pieza> listPiezas() {
		return pservice.listPiezas();
	}
	
	@GetMapping("/pieza/{id}")
	public Pieza piezaXID(@PathVariable(name="id") Long id) {
		return pservice.piezaXID(id);
	}
	
	@PostMapping("/pieza")
	public Pieza savePieza(@RequestBody Pieza pieza) {
		return pservice.savePieza(pieza);
	}
	
	@PutMapping("/pieza/{id}")
	public Pieza editPieza(@PathVariable(name="id") Long id, @RequestBody Pieza pieza) {
		Pieza piezaSelected = new Pieza();
		Pieza piezaUpdated = new Pieza();
		
		piezaSelected = pservice.piezaXID(id);
		piezaSelected.setNombre(pieza.getNombre());
		
		piezaUpdated = pservice.savePieza(piezaSelected);
		
		return piezaUpdated;
	}
	
	@DeleteMapping("/pieza/{id}")
	public void deletePieza(@PathVariable(name="id") Long id) {
		pservice.deletePieza(id);
	}
	
}
