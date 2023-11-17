import java.util.Scanner;

public class Ejercicio3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[pedirCantidadNumeros(scanner)];
		pedirNumeros(scanner, numeros);
		mostrarNumerosOrdenNormal(numeros);
		mostrarNumerosOrdenInverso(numeros);
	}

	private static void mostrarNumerosOrdenInverso( int[] numeros) {
		// TODO Auto-generated method stub
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.printf("%d ", numeros[i]);
		}
			System.out.println();

	}

	private static void mostrarNumerosOrdenNormal( int[] numeros) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i]);
		}
		System.out.println();
	}

	private static void pedirNumeros(Scanner scanner, int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce números");
			numeros[i]= scanner.nextInt();

		}
		
	}

	private static int pedirCantidadNumeros(Scanner scanner) {

		System.out.println("Cuántos números vas a introducir?");
		int cantidad = scanner.nextInt();
		while (cantidad <= 0) {
			System.out.println("El número introducido es 0 o menor. Cuántos números vas a introducir?");
			cantidad = scanner.nextInt();
		}

		return cantidad;

	}
}