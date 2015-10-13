package es.cam.getafe.android;

/**
 * 
 * @author profesormanana
 *
 */

public class Lanzador{
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String nombre = "Victor";
		
		System.out.println(nombre);
		
		//Instanciar o construir un objeto
		new Coche("Rojo",1);
		
		//Crear y asignar un objeto a una variable
		Coche c = new Coche("Rojo",1);
		
		c.frenar();

		System.out.println(c.color);
		
		c.color = "amarillo";
		
	}

}
