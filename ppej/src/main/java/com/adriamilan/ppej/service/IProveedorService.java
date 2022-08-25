package com.adriamilan.ppej.service;

import java.util.List;

import com.adriamilan.ppej.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listProveedores();
	
	public Proveedor proveedorXID(Long id);
	
	public Proveedor saveProveedor(Proveedor proveedor);
	
	public Proveedor editProveedor(Proveedor proveedor);
	
	public void deleteProveedor(Long id);
	
}
