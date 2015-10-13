package com.ejemplo.herencia;


public class Direccion {
	private String calle = "";
	private int numero;
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		if(calle != null){
			this.calle = calle;
		}
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + "]";
	}
	
	
	
	
}
