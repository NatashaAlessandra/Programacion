package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Condicional6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una letra mayúscula");
		String cadena = scanner.nextLine();
		
		if (cadena.length ()==1 && cadena.equals(cadena.toUpperCase())) {
			
			System.out.println("Gracias, lo hiciste bien");
		
		
			}
		else {
			System.out.println("Tienes que escribir solo una letra mayúscula");
			 cadena = scanner.nextLine();
			if (cadena.length ()==1 && cadena.equals(cadena.toUpperCase())){
				
				System.out.println("Gracias, lo hiciste bien");
		}
	}
	
	}
}
	
	

	
	


