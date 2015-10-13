package com.ejemplo.eventos;

public class MiPropioChangeListener implements ChangeListener {

	@Override
	public void onChange(ChangeEvento evento) {
		System.out.println("Se ejecuta la accion de MiPropioChangeListener, "
						+ "con texto: " + evento.getTarget().getText());

	}

}
