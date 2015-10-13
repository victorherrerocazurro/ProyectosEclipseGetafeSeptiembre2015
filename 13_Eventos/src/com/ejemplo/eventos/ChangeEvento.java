package com.ejemplo.eventos;

public class ChangeEvento implements Evento {

	private Componente target;
	
	public ChangeEvento(Componente componente) {
		this.target = componente;
	}

	@Override
	public void setTarget(Componente target) {
		this.target = target;
	}

	@Override
	public Componente getTarget() {
		return target;
	}

}
