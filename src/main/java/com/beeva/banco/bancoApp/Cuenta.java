package com.beeva.banco.bancoApp;

public class Cuenta{
	
	
	public Cuenta(double b) {
		balance = b;
	}

	protected static double balance;
	
	

	public double getBalance() {
		return balance;
	}

	public void deposito(double x) {
		
		balance +=x;
		
	}
	
	public void retiro(double x){
		balance -=x;
	}

}
