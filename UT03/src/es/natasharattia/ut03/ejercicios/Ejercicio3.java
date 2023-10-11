package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, dime tu nombre:");
		String nombre= scanner.nextLine();
		System.out.println("Hola " + nombre);
		scanner.close();
		
	}

}
