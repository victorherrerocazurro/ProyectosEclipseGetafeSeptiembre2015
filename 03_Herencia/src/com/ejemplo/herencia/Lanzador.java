package com.ejemplo.herencia;

public class Lanzador {

	public static void main(String[] args) {
	
		Persona persona = new Persona("Victor");
		
		Object obj = persona;
		
	
		
		Cliente cliente = new Cliente("Juan");
		
		persona = cliente;
		
		obj = cliente;
		
		
		cliente = (Cliente) persona;
		
	}
	
}
