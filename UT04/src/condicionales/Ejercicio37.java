package condicionales;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la frase completa");
		String frase = scanner.nextLine();
		System.out.println("Introduce la palabra que quieres buscar");
		String palabra = scanner.nextLine();
		
		String fraseMinuscula = frase.toLowerCase();
		String palabraMinuscula = palabra.toLowerCase();
		
		int posicion = fraseMinuscula.indexOf(palabraMinuscula);
		
		while(posicion > 0) {
			System.out.println(posicion);
			posicion = fraseMinuscula.indexOf(palabraMinuscula, posicion+1);
		}
	}

}
