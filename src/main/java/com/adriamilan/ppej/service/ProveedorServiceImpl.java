package com.adriamilan.ppej.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.ppej.dao.IProveedorDAO;
import com.adriamilan.ppej.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDAO pDao;

	@Override
	public List<Proveedor> listProveedores() {
		return pDao.findAll();
	}

	@Override
	public Proveedor proveedorXID(Long id) {
		return pDao.findById(id).get();
	}

	@Override
	public Proveedor saveProveedor(Proveedor proveedor) {
		return pDao.save(proveedor);
	}

	@Override
	public Proveedor editProveedor(Proveedor proveedor) {
		return pDao.save(proveedor);
	}

	@Override
	public void deleteProveedor(Long id) {
		pDao.deleteById(id);
	}

}
