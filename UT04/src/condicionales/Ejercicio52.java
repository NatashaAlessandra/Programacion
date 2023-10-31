package condicionales;

import java.util.Scanner;

public class Ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		boolean numA = pedirConfirmacion(scanner, "¿Seguro que quieres hacer el examen el jueves?");
		System.out.println("El usuario ha respondido: " + numA);
		boolean numB = pedirConfirmacion(scanner, "Pero, ¿Seguro?");
		System.out.println("El usuario ha respondido: " + numB);
		boolean numC = pedirConfirmacion(scanner, "¿Vas a aprobar?");
		System.out.println("El usuario ha respondido: " + numC);
	}

	private static boolean pedirConfirmacion(Scanner sc, String pregunta) {
	

		String respuestaUsuario;
		do {
			System.out.println(pregunta);
			respuestaUsuario = sc.next();
			if (respuestaUsuario.equalsIgnoreCase("S") || respuestaUsuario.equalsIgnoreCase("N"));{
				System.out.println("El valor introducido solo puede ser 'S', 's' o 'N', 'n' ");
			}
		} while(!respuestaUsuario.equalsIgnoreCase("S")&&!respuestaUsuario.equalsIgnoreCase("N"));
		return respuestaUsuario.equalsIgnoreCase("S");
	}
}
