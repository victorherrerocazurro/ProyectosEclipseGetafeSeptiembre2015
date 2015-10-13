package com.ejemplo.builder;

import com.ejemplo.builder.AlertDialog.Builder;

public class Lanzador {

	public static void main(String[] args) {
		
		//new AlertDialog();
		
		Builder builder = new AlertDialog.Builder();
		
		builder
			.setId(1)
			.setNombre("Victor");
		
		AlertDialog alertDialog = builder.build();
		
		builder.setId(2);
		
		AlertDialog alertDialog2 = builder.build();
		
		System.out.println(alertDialog);
		System.out.println(alertDialog2);
		
	}
}