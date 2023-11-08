import java.util.Scanner;

public class Ejercicio5Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numElementos = pedirNumeros (scanner);

		System.out.println("Escribe 10 números");
		numElementos = scanner.nextInt();
		
	}

	private static int pedirNumeros(Scanner scanner) {
		// TODO Auto-generated method stub

		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Escribe 10 números ", i);
			numeros[i] = scanner.nextInt();
			
		}
		System.out.printf("La tercera posición es %d  y la cuarta posición es %d", numeros[2], numeros[4]);
		return 0;

	}

}
