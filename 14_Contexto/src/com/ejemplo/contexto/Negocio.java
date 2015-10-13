package com.ejemplo.contexto;

public class Negocio {
	
	private int cont;
	
	public void ejecutar(){
		cont++;
		System.out.println("Se ejecuta el negocio: " + cont);
	}
}
