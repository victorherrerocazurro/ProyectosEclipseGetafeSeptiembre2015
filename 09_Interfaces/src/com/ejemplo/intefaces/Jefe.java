package com.ejemplo.intefaces;

public class Jefe {
	
	//private boolean tengoComercial = false;
	
	private Comercial comercial;
	
	//Inyeccion de dependencias por constructor
	public Jefe(Comercial comercial) {
		super();
		this.comercial = comercial;
	}
	
	public void ponerEnMarchaLaEmpresa(){
		//if (tengoComercial){
			comercial.vender();
		//}
		
	}

	//Inyeccion de dependencias por Setter
	public void setComercial(Comercial comercial) {
		/*if (comercial != null){
			tengoComercial = true;*/
			this.comercial = comercial;
		/*} else {
			tengoComercial = false;
		}*/
		
	}
	
	
}
