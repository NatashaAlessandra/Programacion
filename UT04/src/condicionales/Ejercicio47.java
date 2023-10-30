package condicionales;

import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Repite el ejercicio anterior, pero esta vez no uses la clase
//		String en el método. Usa divisiones 
//		enteras para saber cuántas veces 
//		puedes dividir un número por 10.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numeroEntero = scanner.nextInt();
		int resultadoPositivo = esPositivo(numeroEntero);

		if (resultadoPositivo != 0) {
			int cifras = 1;
			while (numeroEntero > 10) {
				numeroEntero = numeroEntero / 10;
				cifras++;
			}
			System.out.printf("El numero de cifras es %d\n ", cifras);
		}
		
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
