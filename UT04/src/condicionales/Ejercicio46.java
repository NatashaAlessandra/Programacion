package condicionales;

import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numeroEntero = scanner.nextInt();
		int resultadoPositivo = esPositivo(numeroEntero);

		String textoResultadoPosiivo = resultadoPositivo + "";
		System.out.println("El numero de cifras es de " + textoResultadoPosiivo.length());
	}

	public static int esPositivo(int numeroEntero) {

		int resultadoPositivo;
		if (numeroEntero > 0) {
			System.out.println("El numero es positivo");
			resultadoPositivo = numeroEntero;
		} else {
			System.out.println("ERROR El numero es 0 o negativo");
			resultadoPositivo = 0;
		}
		return resultadoPositivo;
	}
}
