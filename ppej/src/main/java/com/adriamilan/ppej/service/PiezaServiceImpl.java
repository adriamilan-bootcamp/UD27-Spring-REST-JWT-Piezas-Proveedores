package com.adriamilan.ppej.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.ppej.dao.IPiezaDAO;
import com.adriamilan.ppej.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {
	
	@Autowired
	IPiezaDAO piezaDao;

	@Override
	public List<Pieza> listPiezas() {
		return piezaDao.findAll();
	}

	@Override
	public Pieza piezaXID(Long id) {
		return piezaDao.findById(id).get();
	}

	@Override
	public Pieza savePieza(Pieza pieza) {
		return piezaDao.save(pieza);
	}

	@Override
	public Pieza editPieza(Pieza pieza) {
		return piezaDao.save(pieza);
	}

	@Override
	public void deletePieza(Long id) {
		piezaDao.deleteById(id);
	}

}
