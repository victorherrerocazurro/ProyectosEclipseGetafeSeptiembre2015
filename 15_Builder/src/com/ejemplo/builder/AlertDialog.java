package com.ejemplo.builder;

public class AlertDialog {

	private String nombre;
	private int id;
	private int layout;
	private String[] valores;
	private boolean[] seleccion;
	
	private AlertDialog() {
		// TODO Auto-generated constructor stub
	}
	
	private AlertDialog(String nombre, int id, int layout, String[] valores, boolean[] seleccion) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.layout = layout;
		this.valores = valores;
		this.seleccion = seleccion;
	}

	public void setNombre(String nombre2) {
		this.nombre = nombre2;
		
	}

	@Override
	public String toString() {
		return "AlertDialog [nombre=" + nombre + ", id=" + id + "]";
	}

	public void setId(int id2) {
		this.id = id2;		
	}

	public static class Builder{
		
		private String nombre;
		private int id = -1;
		private int layout;
		private String[] valores;
		private boolean[] seleccion;
		
		
		public Builder() {
			
		}
		
		public AlertDialog build(){
			AlertDialog dialog = new AlertDialog();
			if (this.nombre != null){
				dialog.setNombre(this.nombre);
			}
			if (this.id != -1){
				dialog.setId(this.id);
			}
			
			return dialog;
		}
		
		public Builder setId(int id){
			this.id = id;
			return this;
		}
		
		public Builder setNombre(String nombre){
			this.nombre = nombre;
			return this;
		}
	}
}
