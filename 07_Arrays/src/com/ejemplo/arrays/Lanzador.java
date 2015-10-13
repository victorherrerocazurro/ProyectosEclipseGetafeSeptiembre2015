package com.ejemplo.arrays;

public class Lanzador {

	public static void main(String[] args) {

		int[] enteros = new int[3];
		
		enteros = new int[]{1,2,3,4,5};
		
		String[] cadenas = {"", "", ""};
		boolean[] boleanos = new boolean[]{true, false};
		
		int[][] masEnteros = {{1,2},{2,3,4,5},{1}};

		Object[] objetos = {"", 1, false};
		
		String elString = (String) objetos[1];
		
		int i = masEnteros[1][4];
		
		for (Object object : objetos) {
			System.out.println(object);
		}
		
		
	}

}
