import java.util.Random;

public class Ejercicio7Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		Random rnd = new Random(1);
		generarNumeros(rnd, numeros);

		for (int i = 0; i < numeros.length; i++) {
			if (esPrimo(numeros[i])) {
				System.out.printf("Número primo: %d en la posición %d%n", numeros[i], i);
			}

		}
	}

	private static void generarNumeros(Random rnd, int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(0, 99);
			System.out.printf("%d ", numeros[i]);
		}
	}

	private static boolean esPrimo(int numero) {
		if (numero < 2) {
			return false;

		}
		for (int divisor = 2; divisor < Math.sqrt(numero); divisor++) {
			int resto = numero % divisor;
			if (resto == 0) {
				return false;

			}

		}
		return true;
	}
}