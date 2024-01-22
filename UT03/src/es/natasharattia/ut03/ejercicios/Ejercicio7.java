package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe un número");
		double primerNumero = scanner.nextDouble();
		System.out.println("Escribe otro número");
		double segundoNumero = scanner.nextDouble();
		System.out.println("Escribe otro número más");
		double tercerNumero = scanner.nextDouble();
		double resultado = primerNumero +segundoNumero+tercerNumero;
		System.out.printf("La suma de los números %.2f + %.2f + %.2f = %.2f\n", primerNumero, segundoNumero, tercerNumero, resultado);
		System.out.printf("La media es %.2f\n", (primerNumero + segundoNumero + tercerNumero) / 3);
		scanner.close();
	}

}
