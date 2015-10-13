package com.ejemplo.eventos;

public class ClickEvento implements Evento {

	private Componente target;
	
	public ClickEvento(Componente target) {
		this.target = target;
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
