package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Escribe el primer numero");
		int variableA = scanner.nextInt();
		
		System.out.println("Escribe el segundo número");
		int variableB = scanner.nextInt();
		
		System.out.printf("La variable A vale %d y la variable B vale %d\n", variableA, variableB);
		
		int auxiliar = variableA;
		variableA = variableB;
		variableB = auxiliar;
		
		System.out.printf("La variable A vale %d y la variable B vale %d\n", variableA, variableB);
		
		
	}

}
