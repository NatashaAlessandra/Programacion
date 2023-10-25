package condicionales;

import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("El primer número a sumar");
		double a = scanner.nextDouble();
		System.out.println("El segundo número a sumar");
		double b = scanner.nextDouble();
		
		sumar(a, b);
		
	}

	private static void sumar(double a, double b) {
		System.out.printf("%.4f", a + b);
	}
}
