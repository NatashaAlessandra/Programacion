import java.util.Random;
import java.util.Scanner;

public class Ejercicio4Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int[] numeros = new int[10];
		generarNumeros(rnd, numeros);
	}

	private static void generarNumeros(Random rnd, int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(0, 99);
			System.out.printf("%d\n", numeros[i]);

		}
	}
}