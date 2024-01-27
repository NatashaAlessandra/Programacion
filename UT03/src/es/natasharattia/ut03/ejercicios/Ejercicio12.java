package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer número" );
		int numero1 = scanner.nextInt();
		System.out.println("Introduce otro número");
		int numero2 = scanner.nextInt();
		
		int distancia = Math.abs(numero1 - numero2);
		System.out.printf("La distancia entre el primero número y el segundo número es de %d", distancia );
		
		//int distancia = numero1 - numero2 
		
	}

}
