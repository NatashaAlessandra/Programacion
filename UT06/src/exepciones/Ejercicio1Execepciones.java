package exepciones;


import java.util.Scanner;

public class Ejercicio1Execepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una frase");
		String cadena = scanner.nextLine();

		int numero = 1;
		while (numero != 0) {

			try {

				System.out.println("¿Qué posicion deseas consultar?");

				numero = Integer.valueOf(scanner.nextLine());
				char caracter = cadena.charAt(numero - 1);
				System.out.printf("El caracter en la posición %d es %s\n", numero, caracter);
			} catch (NumberFormatException e) {
				System.out.println("El numero introducido no es un entero");

			} catch (StringIndexOutOfBoundsException e) {
				System.out.printf("El numero introducido debe estar entre %d y %d\n", 1, cadena.length());

			}
		}

	}
}

