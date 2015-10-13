package com.ejercicio.calculadora;

public class SumarOperacionDosOperandos extends OperacionDosOperandos {

	@Override
	public int ejecutar() {
		return this.getOp1() + this.getOp2();
	}
}
