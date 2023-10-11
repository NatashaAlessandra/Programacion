package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Dime un número");
		double primerNumero = scanner.nextDouble();
		System.out.println("Dime otro número");
		double segundoNumero = scanner.nextDouble();
		System.out.println("Uno más");
		double tercerNumero = scanner.nextDouble();

		System.out.printf("La media de %f %f y %f es %.2f \n",primerNumero, segundoNumero , tercerNumero, (primerNumero + segundoNumero + tercerNumero) /3);
		scanner.close();
	}

}
