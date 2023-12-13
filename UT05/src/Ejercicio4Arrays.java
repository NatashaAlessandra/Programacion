
import java.util.Random;


public class Ejercicio4Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int[] numeros = new int[10];
		generarNumeros(rnd, numeros);
		int suma = calcularSuma(numeros);
		calularMedia(suma, numeros);
	}

	private static void generarNumeros(Random rnd, int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(0, 99);
			System.out.printf("%d ", numeros[i]);

		}
		System.out.println();

	}

	private static int calcularSuma(int[] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = numeros[i] + suma;

		}
		System.out.printf("Suma = %d ", suma);
		return suma;
	}

	private static double calularMedia(int suma, int[] numeros) {
		double mediaNum = 0;
		mediaNum = (double)suma / numeros.length;
		System.out.printf("Media = %.2f ", mediaNum);
		return mediaNum;
	}
}