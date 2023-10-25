package condicionales;

import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("El primer número a sumar: ");
		double a = scanner.nextDouble();
		System.out.println("El segundo número a sumar: ");
		double b = scanner.nextDouble();

		double suma = sumar(a, b);
		System.out.printf("%.4f", suma);

		sumar(3, 6);

	}

	private static double sumar(double a, double b) {
		return a + b;
	}
}
