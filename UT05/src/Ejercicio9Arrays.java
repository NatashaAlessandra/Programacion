import java.util.Random;

public class Ejercicio9Arrays {

	private static final int CANTIDAD_NUMEROS = 10;
	private static final int MIN = 0;
	private static final int MAX = 99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[CANTIDAD_NUMEROS];
		Random rnd = new Random(1);
		llenarConAleatorios(rnd, num);
		procesarNumeros(num);

	}

	private static boolean esPar(int numPar) {
		if (numPar % 2 == 0) {
			return true;
		}

		return false;

	}

	private static void procesarNumeros(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (esPar(num[i])) {
				int resultadoPar = num[i] / 2;
				System.out.println("La division del numero  " + num[i] + " random par es de " + resultadoPar);
			} else {
				int resultadoImpar = num[i] * 2;
				System.out.println("La multiplicacion del numero  " + num[i] + " random par es de " + resultadoImpar);
			}

		}

	}

	private static int[] llenarConAleatorios(Random rnd, int numeros[]) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(MIN, MAX);
			if (numeros.length -1 == i)  {
				System.out.printf("%d ", numeros[i]);
			}else {
				
				System.out.printf("%d, ", numeros[i]);

			}

		}
		System.out.println();
		return numeros;
	}
}
