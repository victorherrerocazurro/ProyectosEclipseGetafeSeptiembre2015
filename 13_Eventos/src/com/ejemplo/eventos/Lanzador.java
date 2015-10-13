package com.ejemplo.eventos;

public class Lanzador {

	public static void main(String[] args) {
		
		TextoEditableComponente componente = new TextoEditableComponente();

		ChangeListener changeListenerInterna = new ChangeListener() {
			@Override
			public void onChange(ChangeEvento evento) {
				System.out.println("Se ejecuta la accion de la clase Interna y anonima, "
						+ "con texto: " + evento.getTarget().getText());
				
			}
		};
		
		componente.registerOnChangeListener(changeListenerInterna);
		
		MiPropioChangeListener changeListener = new MiPropioChangeListener();
		
		componente.registerOnChangeListener(changeListener);
		
		componente.setText("El nuevo texto del componente");
		
		componente.unregisterOnChangeListener(changeListener);
		componente.unregisterOnChangeListener(changeListenerInterna);
		
		componente.setText("y lo cambiamos de nuevo");
		
		
	}

}
