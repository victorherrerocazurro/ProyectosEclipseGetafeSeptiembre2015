package com.ejercicio.calculadora;

public class Lanzador {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.setOp1(1);
		calculadora.setOp2(2);
		calculadora.sumar();
		
		System.out.println(calculadora.getResultado());//3
		
		calculadora.restar();
		
		System.out.println(calculadora.getResultado());//-1
		
		calculadora.setOp1(4);
		calculadora.setOp2(8);
		
		calculadora.restar();
		
		System.out.println(calculadora.getResultado());//-4
		
		//////////////////////
		
		Calculadora2 calculadora2 = new Calculadora2();
		
		int resultado = calculadora2.sumar(1, 2);
		
		System.out.println(resultado);//3
		

	}

}
