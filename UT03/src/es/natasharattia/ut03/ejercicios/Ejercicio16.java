package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	static private final int PUNTOS_CORRECTA = 5;
	private final static int PUNTOS_INCORRECTA = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuántas respuestas son correctas?");
		int numCorrectas = scanner.nextInt();
		System.out.println("¿Cuántas respuestas son incorrectas?");
		int numIncorrectas = scanner.nextInt();

		int nota = (numCorrectas * PUNTOS_CORRECTA) + (numIncorrectas * PUNTOS_INCORRECTA);

		System.out.printf("La nota final es %d", nota);
		scanner.close();

	}

}
