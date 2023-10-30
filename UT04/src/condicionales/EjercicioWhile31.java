package condicionales;

import java.util.Scanner;
import java.util.Random;

public class EjercicioWhile31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Random rnd = new Random();
		int numeroSecreto = rnd.nextInt(1, 100);
		System.out.println("El número que hay que adivinar es el  " + numeroSecreto);

		int numero = 0;

		int intentosRestantes;
		for (intentosRestantes = 10; (intentosRestantes > 0)
				&& (numero != numeroSecreto); intentosRestantes--) {
			System.out.printf("Introduce un número (quedan %d intentos): \n", intentosRestantes);
			numero = scanner.nextInt();

			if (numeroSecreto < numero) {
				System.out.println("El número secerto es menor");
		} else if (numeroSecreto > numero) {
				System.out.println("El numero secreto es mayor");
			}
		}
		if (numero == numeroSecreto) {
			System.out.printf("Has adivinado, acertaste en %d intentos. \n ¡Ganaste!", 10 - intentosRestantes);
		} else {
			System.out.printf("No has acertado. Era %d. \n ", numeroSecreto);
		
		}

	}
}