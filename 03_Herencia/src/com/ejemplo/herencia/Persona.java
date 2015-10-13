package com.ejemplo.herencia;

import java.util.Date;

public class Persona {

	// Atributos
	private String nombre;
	private Date fechaNacimiento;
	private Direccion direccion;

	//Constructores
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Getter y Setter
	public String getNombre() {
		return nombre;
	}

	final public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Persona[" + nombre + ", " + direccion + "]";
	}
	

}
