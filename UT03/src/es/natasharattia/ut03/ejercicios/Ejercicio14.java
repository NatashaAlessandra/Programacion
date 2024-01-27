package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Realizar un programa que lea un número
		// y que muestre su raíz cuadrada, su raíz cúbica y su raíz quinta. Java no
		// tiene
		// ninguna función predefinida que permita calcular la raíz quinta, ¿Cómo se
		// puede calcular?

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe un número");
		double numero = scanner.nextDouble();

		double raizCuadrada = Math.sqrt(numero);
		double raizCubica = Math.cbrt(numero);
		double raizQuinta = Math.pow(numero, 1.0 / 5.0);
		System.out.printf("La raíz cuadrada de numero es de %.2f, la raíz cúbica es %.2f y la raíz quinta es %.2f",
				raizCuadrada, raizCubica, raizQuinta);
		scanner.close();
	}

}
