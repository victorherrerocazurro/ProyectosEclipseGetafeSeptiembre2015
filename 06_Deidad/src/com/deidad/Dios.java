package com.deidad;

public class Dios {

	private final static Dios instance;
	
	static{
		instance = new Dios();
	}
	
	private Dios() {
		super();
	}
	
	public static Dios getInstance(){
		return instance;
	}

}
