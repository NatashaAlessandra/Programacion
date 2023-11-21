import java.util.Random;

public class Ejercicio9Arrays {

	private static final int CANTIDAD_NUMEROS = 10;
	private static final int MIN = 0;
	private static final int MAX = 99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[CANTIDAD_NUMEROS];
		Random rnd = new Random();
		llenarConAleatorios(rnd, num);
		mostrarNumeros(num);
		
		procesarNumeros(num);
		System.out.println("División de número pares es de %d" + num);
//		int mostraPares = esPar();

	}

	private static boolean esPar(int numPar) {
		if (numPar % 2 == 0) {
			return true;
		}
		
		return false;

	}

	private static void mostrarNumeros(int num[]) {

	}

	private static void procesarNumeros(int[] num) {
		
		for (int i = 0; i < num.length; i++) {
			num[i] = num[i] / 2;
			if (esPar(num[i])) {
				int resultado = num[i] / 2;
			}	
		}
	}

	private static int[] llenarConAleatorios(Random rnd, int numeros[]) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(MIN, MAX);
			System.out.printf("%d ", numeros[i]);
		}
		return numeros;
	}
}
