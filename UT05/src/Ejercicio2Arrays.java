import java.util.Scanner;

public class Ejercicio2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		final int numElementos = 10;
		
		String[] nombres = new String[numElementos];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce el nombre");
			nombres[i] = scanner.next();
			System.out.printf("El nommbre %s esta en la posición %d", nombres [5], i);
		}
		
		for (int i = 0; i < nombres.length; i++) {
			String string = nombres[i];

		}

	}

}
