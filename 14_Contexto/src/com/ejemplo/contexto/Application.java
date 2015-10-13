package com.ejemplo.contexto;

public class Application {

	private Negocio negocio;
	
	public void iniciarAplicacion(){
		
		negocio = new Negocio();
		
		new MainActivity(this);
		
		new SecondaryActivity(this);
		
	}

	public Negocio getNegocio() {
		return negocio;
	}
}

