package condicionales;

import java.util.Scanner;

public class EjercicioWhile27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int cantidadNum;

		System.out.println("Cúantos números vamos a procesar?");
		cantidadNum = scanner.nextInt();
		for (int i = 0; i < cantidadNum; i++) { // (inicialización; expresión-lógica; iteracción)
			//

			System.out.println("Introduce un número: ");
			int numero = scanner.nextInt();
			if (numero < 0) {
				System.out.println("El numero introducido es menor que 0");
			} else if (numero == 0) {
				System.out.println("El número introducido es igual que 0");
			} else {
				System.out.println("El número introducido es mayor que 0");
			}
		}

	}
}
