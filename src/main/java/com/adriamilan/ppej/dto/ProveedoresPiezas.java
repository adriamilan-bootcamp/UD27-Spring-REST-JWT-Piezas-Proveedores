package com.adriamilan.ppej.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProveedoresPiezas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="pieza")
	private Pieza pieza;

	@ManyToOne
	@JoinColumn(name="proveedor")
	private Proveedor proveedor;
	
	// Constructor por defecto
	public ProveedoresPiezas() {
		
	}

	/**
	 * @param id
	 * @param pieza
	 * @param proveedor
	 */
	public ProveedoresPiezas(Long id, com.adriamilan.ppej.dto.Pieza pieza, Proveedor proveedor) {
		super();
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
	}

	/**
	 * @return the pieza
	 */
	public Pieza getPieza() {
		return this.pieza;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ProveedoresPiezas [id=" + id + ", Pieza=" + pieza + ", proveedor=" + proveedor + "]";
	}
	
}
