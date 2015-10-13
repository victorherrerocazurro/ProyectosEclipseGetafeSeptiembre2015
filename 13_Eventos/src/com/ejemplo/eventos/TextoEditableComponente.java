package com.ejemplo.eventos;

import java.util.Collection;
import java.util.LinkedList;

public class TextoEditableComponente implements Componente {

	private String text;
	private ClickListener clickListener;
	private Collection<ChangeListener> changeListner = new LinkedList<>();
	
	@Override
	public void setOnClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	@Override
	public void registerOnChangeListener(ChangeListener changeListener) {
		this.changeListner.add(changeListener);
	}
	
	@Override
	public void unregisterOnChangeListener(ChangeListener changeListener){
		this.changeListner.remove(changeListener);
	}

	@Override
	public void setText(String text) {
		this.text = text;
		
		//Lanzamiento de un evento a un unico Listener
		ClickEvento clickEvento = new ClickEvento(this);
		
		if(clickListener != null){
			clickListener.onClick(clickEvento);
		}
		
		//Lanzamineto de un evento a varios Listener
		ChangeEvento evento = new ChangeEvento(this);
		
		for (ChangeListener changeListener : changeListner) {
			changeListener.onChange(evento);
		}

	}

	@Override
	public String getText() {
		return text;
	}

	
	
	
}
