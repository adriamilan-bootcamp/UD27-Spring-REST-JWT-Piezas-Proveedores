package com.adriamilan.ppej.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.ppej.dao.IProveedoresPiezasDAO;
import com.adriamilan.ppej.dto.ProveedoresPiezas;

@Service
public class ProveedoresPiezasServiceImpl implements IProveedoresPiezasService {

	@Autowired
	IProveedoresPiezasDAO ppDao;

	@Override
	public List<ProveedoresPiezas> listProveedoresPiezas() {
		return ppDao.findAll();
	}

	@Override
	public ProveedoresPiezas proovedoresPiezasXID(Long id) {
		return ppDao.findById(id).get();
	}

	@Override
	public ProveedoresPiezas saveProveedoresPiezas(ProveedoresPiezas proveedoresPiezas) {
		return ppDao.save(proveedoresPiezas);
	}

	@Override
	public ProveedoresPiezas editProveedoresPiezas(ProveedoresPiezas proveedoresPiezas) {
		return ppDao.save(proveedoresPiezas);
	}

	@Override
	public void deletProovedoresPiezas(Long id) {
		ppDao.deleteById(id);
	}
	
}
