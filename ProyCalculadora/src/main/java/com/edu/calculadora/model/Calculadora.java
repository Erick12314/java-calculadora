package com.edu.calculadora.model;

public class Calculadora {

	private double numero1;
	private double numero2;
	private char operacion;
	private String mensaje;
	
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	public char getOperacion() {
		return operacion;
	}
	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
