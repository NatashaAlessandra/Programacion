import java.util.Random;

public class Ejercicio8Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[20];

		llenarConAleatorios(numeros);
		System.out.println();
		int sumarPares = calcularSumaPosicionesPares(numeros);
		System.out.printf("La suma de las posiciones pares es:  %d %n", sumarPares);
		double mediaImpares = calcularMediaPosiciones(numeros);
		System.out.printf("La media de las posiciones impares es:  %.2f ", mediaImpares);

	}

	private static int[] llenarConAleatorios(int[] numeros) {
		Random rnd = new Random(1);
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(0, 99);
			System.out.printf("%d ", numeros[i]);
		}
		return numeros;
	}

	private static int calcularSumaPosicionesPares(int[] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i += 2) {
			suma = suma + numeros[i];

		}

		return suma;
	}

	private static double calcularMediaPosiciones(int[] numeros) {
		int sumaImpar = 0;
		double media = 0;
		for (int i = 1; i < numeros.length; i += 2) {
			sumaImpar = sumaImpar + numeros[i];

		}
		System.out.println("La suma de las posiciones impares es: " + sumaImpar);

		media = (double) sumaImpar / 2;
		return media;
	}

}