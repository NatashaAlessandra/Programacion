import java.util.Scanner;

public class Ejercicio6Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Copiar ejercicio 5 y crear dos metodos para saber el valor min y valor max
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Escribe un número entero ");
			numeros[i] = scanner.nextInt();
		}
		buscaMaxima(numeros);
		buscaMinimo(numeros);
		
		
	}

	private static int buscaMinimo(int[] numeros) {
		// TODO Auto-generated method stub
		int numMenor= numeros[0];
		int posMenor=0;
		for (int posActual = 0; posActual < numeros.length; posActual++) {
			int numPosActual = numeros[posActual];
			if (numPosActual < numMenor)
				numMenor = numPosActual;
			posMenor = posActual;
		}
		System.out.printf("El mínimo es %d y esta en la posición %d\n", numMenor, posMenor);
		return posMenor;

	}

	private static int buscaMaxima(int numeros[]) {
		int numMayor = numeros[0];
		int posMayor = 0;
		for (int posActual = 0; posActual < numeros.length; posActual++) {
			int numPosActual = numeros[posActual];

			if (numPosActual > numMayor) {
				numMayor = numPosActual;
				posMayor = posActual;

			}

		}
		System.out.printf("El máximo es %d y esta en la posición %d\n", numMayor, posMayor);
		return posMayor;
	}
}
