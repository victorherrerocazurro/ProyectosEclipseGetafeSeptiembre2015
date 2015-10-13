package com.ejercicio;

public class Lanzador {

	public static void main(String[] args) {
		
		Direccion d = new Direccion();
		d.setCalle("Otra");
		d.setNumero(2);
		
		
		Persona p = new Persona();
		
		p.setNombre("Victor");
		//p.direccion = new Direccion();
		p.setDireccion(d);
		
		Direccion tmp = p.getDireccion();

		tmp.setCalle("Mayor");
		tmp.setNumero(1);
		
		System.out.println(p.toString());

	}

}
