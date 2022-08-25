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
public class Pieza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pieza")
	private List<ProveedoresPiezas> proveedoresPiezas;
	
	// Constructor por defecto
	public Pieza() {
		
	}

	/**
	 * @param code
	 * @param nombre
	 */
	public Pieza(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
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
	 * @return the pieza
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ProveedoresPiezas")
	public List<ProveedoresPiezas> getProveedoresPiezas() {
		return proveedoresPiezas;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setProveedoresPiezas(List<ProveedoresPiezas> proveedoresPiezas) {
		this.proveedoresPiezas = proveedoresPiezas;
	}

	@Override
	public String toString() {
		return "Pieza [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
