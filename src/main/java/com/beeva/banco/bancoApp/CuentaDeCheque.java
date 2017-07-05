package com.beeva.banco.bancoApp;

public class CuentaDeCheque extends Cuenta{

	public CuentaDeCheque(double b) {
		super(balance);
	}
	
	public double retirarCheque(double retiro){
		double resultado;
		resultado = balance - retiro;
		return resultado;
	}

}
