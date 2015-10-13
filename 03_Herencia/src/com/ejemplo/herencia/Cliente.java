package com.ejemplo.herencia;

public class Cliente extends Persona {

	public Cliente(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}


	private int identicador;
	
	
	public int getIdenticador() {
		return identicador;
	}


	public void setIdenticador(int identicador) {
		this.identicador = identicador;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cliente[id=" + identicador + ", persona= " + super.toString() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identicador;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (identicador != other.identicador)
			return false;
		return true;
	}
	
	

}
