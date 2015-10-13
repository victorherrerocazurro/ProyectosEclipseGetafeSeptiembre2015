package com.ejemplo.colecciones;

public class Dao<E extends Number,K> {
	public void insertar(E p) {
		//INSERT INTO PERSONA (id, nombre) VALUES (?,?)
		//p.getNombre();
		//p.getId();
		
		//session.persist(f);
		
		p.intValue();
		
	}
	public void borrar() {

	}
	public void actualizar() {

	}
	public E consultar() {
		return null;
		//return session.query();
	}
	public E consultar(K id) {
		return null;
		//return session.query();
	}
}
