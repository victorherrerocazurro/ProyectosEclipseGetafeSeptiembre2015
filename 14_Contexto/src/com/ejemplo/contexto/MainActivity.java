package com.ejemplo.contexto;

public class MainActivity extends Activity {

	public MainActivity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MainActivity(Application contexto) {
		super(contexto);
		// TODO Auto-generated constructor stub
	}
	
	
	public void onCreate(){
		//Las tareas dentro de MainActivity
		getContexto().getNegocio().ejecutar();
	}

}
