package es.cam.getafe.android;

public class Coche {
	
	//Atributos o caracteristicas
	String color; //null
	int tamanoRueda; //0
	
	//Constructores
	public Coche(String color, int tamanoRueda) {
		super();
		this.color = color;
		this.tamanoRueda = tamanoRueda;
		
	}
	
	public Coche() {
		super();
		color = null;
		tamanoRueda = 0;
		
	}	
	
	//Metodos o acciones
	float acelerar(float aceleracion){
		return 1.0f; 
	}
	
	void frenar(){
		System.out.println(color);
	}
	
}
