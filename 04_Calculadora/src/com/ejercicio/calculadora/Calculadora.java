package com.ejercicio.calculadora;

public class Calculadora {
	private int op1;
	private int op2;
	private int resultado;
	
	//Constructores
	
	
	public int getResultado() {
		return resultado;
	}
	public Calculadora(int op1, int op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}
	public Calculadora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	
	//Metodos

	public void sumar() {
		this.resultado = this.op1 + this.op2;
	}

	public void multiplicar() {
		this.resultado = this.op1 * this.op2;
	}
	
	public void restar() {
		this.resultado = this.op1 - this.op2;
	}
	
	/**
	 * Metodo que si en el atributo op2, hay un 0, dara una excepcion
	 */
	
	public void dividir() {
		this.resultado = this.op1 / this.op2;
	}
	
	
}

