package com.ejemplo.contexto;

public class SecondaryActivity extends Activity {

	public SecondaryActivity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondaryActivity(Application contexto) {
		super(contexto);
		// TODO Auto-generated constructor stub
	}
	
	public void onCreate(){
		//Las tareas dentro de SecondaryActivity
		getContexto().getNegocio().ejecutar();
	}
	
}
