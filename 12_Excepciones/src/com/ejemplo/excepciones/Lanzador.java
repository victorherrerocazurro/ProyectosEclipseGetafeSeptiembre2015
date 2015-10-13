package com.ejemplo.excepciones;

import java.text.ParseException;
import java.util.logging.Logger;

public class Lanzador {

	private static Logger log = Logger.getLogger(Lanzador.class.getName());

	public static void main(String[] args) {
		// Esto se hace en una clase en la que se tenga la
		// posibilidad de interaccionar con el usuario
		try {
			algoritmoConPosibilidadDeExcepcion();
			System.out.println("Estoy dentro del bloque que da error, justo despues de dar error");
		} catch (ParseException | UnsupportedOperationException e) {
			// Proporciona el feedback al usuario de la aplicacion
			System.out.println("Ha ocurrido un error");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void algoritmoConPosibilidadDeExcepcion() throws Exception  {
		try {
			throw new MiPropiaException("Esta excepcion se lanza por que yo lo digo");
		} catch (Exception e) {
			// Dejar rastro en el logthrows Exception
			log.severe(e.getMessage());
			//log.log(Level.SEVERE, e.getMessage());
			// Lanzar la excecpion para que llegue a la interface de usuario
			throw e;
		} finally {
			//Esto se ewjcuta siempre, haya error o no
		}
		
		
	}
}