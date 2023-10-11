package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
			System.out.println("Escribe un numero");
			int numeroUno = scanner.nextInt();
			System.out.println("Escribe otro numero");
			int numeroDos = scanner.nextInt();
		if (numeroUno > numeroDos) {
			System.out.printf("El número es mayor es el primero: %d", numeroUno);
		} else {
			System.out.printf("El número es menor es el segundo: %d", numeroDos );
		}   
			

		}
	}
		
	
	


