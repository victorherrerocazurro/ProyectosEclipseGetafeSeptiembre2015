package com.ejercicio.herramientas;

public class CajaDeHerramientas {
	private Herramienta[] herramientas = new Herramienta[4];//4 herramientas
	
	public void addHerramienta(Herramienta herramienta){
		herramientas[0] = herramienta;
	}
	
	public void trabajar(){
		Object taladro = herramientas[0];
		
		((Electrico)taladro).enchufar();
	}
	
}
