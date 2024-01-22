package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número");
		int primerNumero = scanner.nextInt();
		System.out.println("Escribe otro número");
		int segundoNumero = scanner.nextInt();

		// System.out.println("La suma de los dos números es: " + primerNumero + "+" +
		// segundoNumero + "es " + (primerNumero + segundoNumero) + ".");

		System.out.printf("La suma de %d + %d = %d\n", primerNumero, segundoNumero, primerNumero + segundoNumero);
		System.out.printf("La resta de %d - %d = %d\n", primerNumero, segundoNumero, primerNumero - segundoNumero);
		System.out.printf("La resta de %d - %d = %d\n", segundoNumero, primerNumero, segundoNumero - primerNumero);
		System.out.printf("La multiplicacion de %d * %d = %d\n", primerNumero, segundoNumero,
				primerNumero * segundoNumero);
		System.out.printf("La división de %d / %d = %d\n", primerNumero, segundoNumero, primerNumero / segundoNumero);
		System.out.printf("La divisón de %d / %d = %.2f\n", segundoNumero, primerNumero,
				(double) segundoNumero / primerNumero);
		scanner.close();
	}

}
