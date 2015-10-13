package com.ejemplo.eventos;

public interface Componente {

	public void setOnClickListener(ClickListener clickListener);
	
	public void registerOnChangeListener(ChangeListener changeListener);
	
	public void unregisterOnChangeListener(ChangeListener changeListener);
	
	public void setText(String text);

	public String getText();
	
}
