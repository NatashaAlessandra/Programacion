package condicionales;

import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");

		int numEntero = 0;
		String numCadena = numEntero + "";
		System.out.printf("El numero de cifras es de '%d'", numCadena.length());
		if (numEntero > 0) {
			System.out.println("");
		}

	}

	public static int numeroDeCifras(int numeroEnteroPositivo) {
		int numEntero = 0;
		String numCadena= numEntero+"";
		int resultadoPositivo = 0;
		
		while (numeroEnteroPositivo > 0)
		   
	    System.out.printf("El numero de cifras es de '%d'", numCadena.length());	
		return resultadoPositivo;
	}
}
