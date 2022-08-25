package com.adriamilan.ppej.service;

import java.util.List;

import com.adriamilan.ppej.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> listPiezas();
	
	public Pieza piezaXID(Long id);
	
	public Pieza savePieza(Pieza pieza);
	
	public Pieza editPieza(Pieza pieza);
	
	public void deletePieza(Long id);
	
}
