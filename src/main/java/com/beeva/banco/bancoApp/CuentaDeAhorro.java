package com.beeva.banco.bancoApp;
public class CuentaDeAhorro extends Cuenta{

	public CuentaDeAhorro(double b) {
		super(balance);
	}
	
	public boolean retiroAhorro(double retiro){
		boolean resultado;
		if(balance>5000){
			return true;
		}
		return false;
	}

}
