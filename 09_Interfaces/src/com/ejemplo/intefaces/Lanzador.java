package com.ejemplo.intefaces;

public class Lanzador {

	public static void main(String[] args) {
		Jefe jefe = new Jefe(null);
		
		jefe.ponerEnMarchaLaEmpresa();
		
		jefe.setComercial(new ComercialImpl());
		
		jefe.ponerEnMarchaLaEmpresa();
		
		jefe.setComercial(null);

		jefe.ponerEnMarchaLaEmpresa();
		
	}

}
