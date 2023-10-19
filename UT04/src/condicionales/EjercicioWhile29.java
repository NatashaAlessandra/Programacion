package condicionales;

import java.util.Scanner;

public class EjercicioWhile29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int numero;
		int suma = 0;
		int cuenta = 0;
		double media = 0;
		System.out.println("Introduce un número, 0 para terminar");
		numero = scanner.nextInt();

		while (numero != 0) {
			System.out.println("El número es " + numero);
			if (numero < 0) {
				System.out.println("El número no es válido, no se tendrá en cuenta para el cálculo");
			} else if (numero > 0) {
				suma = suma + numero;
				cuenta++;
				
			}
			System.out.println("Introduce un número");
			numero = scanner.nextInt();
			media = (double) suma / cuenta;
		}

//		System.out.println("La suma de los número es " + suma);
//		System.out.println("La cuenta  de los número es " + cuenta);
		System.out.printf("La suma de los numeros es %d, la cuenta es de %d y la media es %.1f ", suma, cuenta, media);

	}

}
