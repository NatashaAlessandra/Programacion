package condicionales;

import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = scanner.nextInt();
		
		int resultado = factorial(numero);
		
		System.out.printf("El factorial de %d es %d", numero, resultado);
	}

	private static int factorial(int numero) {
		int resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
			
		}
		
		return  resultado;
	}

}
