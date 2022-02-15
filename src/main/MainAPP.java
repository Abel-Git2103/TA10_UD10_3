/*
 * @autor: Abel Jornet
 * Fecha modificación: 07/02/2021
 */
package main;

import objetos.*;

public class MainAPP {

	public static void main(String[] args) {
	
		System.out.println("Generando numero aleatorio...");
		
		try {
			int numero = Aleatorio.Random();
			System.out.println("El numero aleatorio generado es " + numero);
						
			if (numero % 2 == 0) {throw new Excepcion(111);}
			else if (numero % 2 != 0){throw new Excepcion(222);}
				
		} catch (Excepcion ex) {
			System.out.println(ex.getMessage());
		}
	}
}