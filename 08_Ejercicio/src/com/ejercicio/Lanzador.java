package com.ejercicio;

public class Lanzador {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 90; i= i + 10) {
			int j = 1;
			System.out.print(i + " : " + j);
			for (j = 2; j <= 9; j++) {
				System.out.print(", " + j);
			}
			System.out.println();
		}

	}

}
