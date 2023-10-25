package condicionales;

import java.util.Scanner;

public class Ejercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mensaje ");
		String mensaje = scanner.nextLine();
		System.out.println("Número de veces que los quiere mostrar:  ");
		int veces = scanner.nextInt();

		System.out.printf("Valor de veces antes de entrar al método: %d\n", veces);
		mostrarNVeces(mensaje, veces);
		System.out.printf("Valor de veces después de entrar al método: %d\n", veces);
	}

	private static void mostrarNVeces(String mensaje, int cuantasVeces) {
		if (cuantasVeces < 0) {
			System.out.println("El numero de veces no puede ser menor que cero");	
		}
		while (cuantasVeces > 0) {
			System.out.println(mensaje);
			cuantasVeces--;
		}
//		System.out.printf("Valor de cuantasVeces");
	}
}
	