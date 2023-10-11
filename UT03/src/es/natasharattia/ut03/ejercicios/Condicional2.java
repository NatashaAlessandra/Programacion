package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int numeroUno = scanner.nextInt();
			
		if (numeroUno < 0) {
		System.out.println("El numero es negativo");
		}
		else if (numeroUno > 0) {
		System.out.println("El numero es positivo");	
		} 
		
		else 
			System.out.println("El numero es 0");
	}
	
			
}
	
	


