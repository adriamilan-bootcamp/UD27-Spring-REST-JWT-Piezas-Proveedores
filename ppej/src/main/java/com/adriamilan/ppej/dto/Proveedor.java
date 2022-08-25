package com.adriamilan.ppej.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="proveedor")
	private List<ProveedoresPiezas> proveedoresPiezas;
	
	// Constructor por defecto
	public Proveedor() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Proveedor(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @return the proveedor
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ProveedorPiezas")
	public List<ProveedoresPiezas> getProveedoresPiezas() {
		return proveedoresPiezas;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedoresPiezas(List<ProveedoresPiezas> proveedoresPiezas) {
		this.proveedoresPiezas = proveedoresPiezas;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
