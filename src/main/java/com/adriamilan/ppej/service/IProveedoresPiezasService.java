package com.adriamilan.ppej.service;

import java.util.List;

import com.adriamilan.ppej.dto.ProveedoresPiezas;

public interface IProveedoresPiezasService {

	public List<ProveedoresPiezas> listProveedoresPiezas();
	
	public ProveedoresPiezas proovedoresPiezasXID(Long id);
	
	public ProveedoresPiezas saveProveedoresPiezas(ProveedoresPiezas proveedoresPiezas);
	
	public ProveedoresPiezas editProveedoresPiezas(ProveedoresPiezas proveedoresPiezas);

	public void deletProovedoresPiezas(Long id);
	
}
