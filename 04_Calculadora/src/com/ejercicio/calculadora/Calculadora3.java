package com.ejercicio.calculadora;

public class Calculadora3 {
	private int resultado;
	private SumarOperacionDosOperandos sumarOperacionDosOperandos = new SumarOperacionDosOperandos();

	public int getResultado() {
		return resultado;
	}

	public void sumar(int op1, int op2) {
		sumarOperacionDosOperandos.setOp1(op1);
		sumarOperacionDosOperandos.setOp2(op2);
		
		resultado = sumarOperacionDosOperandos.ejecutar();
	}

	public void restar(int op1, int op2) {

	}

	public void multiplicar() {

	}

	public void dividir() {

	}
}
