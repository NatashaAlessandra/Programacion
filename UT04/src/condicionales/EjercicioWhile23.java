package condicionales;

import java.util.Scanner;

public class EjercicioWhile23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe un número inicial");
		int numeroInicial = scanner.nextInt();
		System.out.println("Escribe un número final");
		int numeroFinal = scanner.nextInt();
		
		if (numeroInicial > numeroFinal)
		System.out.printf("ERROR! %d no es menor o igual al numero final", numeroFinal);
		for (int num = numeroInicial; num <= numeroFinal;num++) {
			System.out.printf("%d ", num);
		}
	}

}
