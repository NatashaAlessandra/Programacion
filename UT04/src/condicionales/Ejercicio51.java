package condicionales;

import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int numA = pedirNumero(scanner, "Introduce tu edad, entre 18 y 30 ambos incluidos",18,31);
		int numB = pedirNumero(scanner, "Introduce la cantidad a escribir, entre 100 y 200 ambos incluidos",100,200);
		int numC = pedirNumero(scanner, "Introduce un año entre 2000 y 2010 ambos incluidos", 2000, 2010);
	}
	
	private static int pedirNumero(Scanner sc, String pregunta, int min, int max) {
		int retorno = 0;
		
		if (min <=max) {
			int numero;
			do
			{
				System.out.println(pregunta);
				numero =sc.nextInt();
					if (numero < min || numero >= max);
						System.out.printf("El número introducido no está entre %d (incluido) y %d (excluido)", numero);
					
			
			}while( numero < min || numero >= max);
		}
		return retorno;
	}
}
