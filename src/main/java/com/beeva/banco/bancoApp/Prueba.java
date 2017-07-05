package com.beeva.banco.bancoApp;
import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.beeva.calculadora.App;


public class Prueba {
	
	public static void main(String[] args){
		
		/*double resultado;
		double deposito;
		int valor;
		Banco b = new Banco();
		
		Scanner scanw = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = scanw.next();
		System.out.println("Introduce tu apellido: ");
		String apellido = scanw.next();
		Cliente c = new Cliente(nombre, apellido);
		System.out.println("Introduce un deposito: ");
		double depo = scanw.nextDouble();
		//Cuenta n = new Cuenta(depo);
		CuentaDeAhorro n = new CuentaDeAhorro(depo);
		c.setCuenta(n);
		b.agregarCliente(c);
		b.numeroDeClientes();
		
		Scanner scaner = new Scanner(System.in);
		boolean s = false;
		
		while (s != true) {
			System.out.println("Que accion quieres realizar");
			System.out.println("1.- Deposito");
			System.out.println("2.- Retiro Ahorro");
			System.out.println("3.- Regresar al menu");
			System.out.println("4.- Salir");
			Scanner scan = new Scanner(System.in);
			valor = scan.nextInt();
			
		switch (valor) {
		case 1:
			System.out.println("Introduce un deposito: ");
			deposito = scaner.nextDouble();
			b.obtenerCliente().getCuenta().deposito(deposito);
			c.getCuenta().deposito(deposito);
			//n.deposito(deposito);
			//resultado = n.getBalance();
			resultado = c.getCuenta().getBalance();
			resultado = b.obtenerCliente().getCuenta().getBalance();
			System.out.println("Nombre: "+b.obtenerCliente().getNombre()+" "+b.numeroDeClientes());
			System.out.println("Deposito de "+resultado+" Pesos Realizado Correctamente");
			System.out.println("3.- Regresar al menu");
			valor = scaner.nextInt();
			break;
		case 2:
			System.out.println("Cuanto necesitas retirar: ");
			deposito = scaner.nextDouble();
			//n.retiro(deposito);
			//c.getCuenta().retiro(deposito);
			boolean resul = n.retiroAhorro(deposito);
			//resultado = n.getBalance();
			if(resul == false){
				System.out.println("No se pudo hacer el retiro necetitas tener 5000");
			}
			resultado = c.getCuenta().getBalance();
			System.out.println("Nombre: "+c.getNombre());
			System.out.println("Retiraste "+deposito+" Pesos");
			System.out.println("Saldo actual: "+resultado+" Pesos");
			System.out.println("3.- Regresar al menu");
			valor = scaner.nextInt();
			break;
		
		case 4:
			s = true;
			break;
		}
		}*/
		App cal = new App();
		int resul = cal.multiplicacion(4, 2);
		System.out.println("resul: "+resul);
		
	}

}
