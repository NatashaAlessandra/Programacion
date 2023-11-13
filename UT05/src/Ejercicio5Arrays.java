import java.util.Scanner;

public class Ejercicio5Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];
		int numMayor = numeros[0];
		int posMayor = 0;
		int numMenor = numeros[0];
		int posMenor = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Escribe un número entero ", i);
			numeros[i] = scanner.nextInt();

		}

		for (int posActual = 0; posActual < numeros.length; posActual++) {
			int numPosActual = numeros[posActual];

			if (numPosActual > numMayor) {
				numMayor = numPosActual;
				posMayor = posActual;
			} else if (numPosActual < numMenor) {
				numMenor = numPosActual;
				posMenor = posActual;
			}

		}
		System.out.printf("El máximo es %d y esta en la posición %d\n", numMayor, posMayor);
		System.out.printf("El mínimo es %d y esta en la posición %d\n", numMenor, posMenor);

	}

}
