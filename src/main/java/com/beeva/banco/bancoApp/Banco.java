package com.beeva.banco.bancoApp;
import java.awt.List;
import java.util.ArrayList;


public class Banco {
	
	
	Cliente[] listaClientes = new Cliente[10];
	
	private int numeroClientes = 0;
	
	public void agregarCliente(Cliente c){
		listaClientes[numeroClientes] = c;
		
	}
	
	public int numeroDeClientes(){
		return numeroClientes++;
	}
	
	public Cliente obtenerCliente(){
		
		for(int i = 0; i<numeroClientes;i++){
			return listaClientes[i];
		}
		return null;	
		
	}

}
