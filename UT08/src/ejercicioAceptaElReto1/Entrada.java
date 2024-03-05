package ejercicioAceptaElReto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

	Scanner sc = new Scanner(System.in);
	int numNiños;
	int numRegalos;

	public int pedirNumeroNiños() {
		System.out.println("Cuántos niños están en la fila");
		numNiños = sc.nextInt();
		return numNiños;
	}

	public int pedirNumeroRegalos() {
		System.out.println("Cuántos niños están en la fila");
		numRegalos = sc.nextInt();
		return numRegalos;

	}
	
	ArrayList<Integer> colaDeRegalos = new ArrayList<>();
}
