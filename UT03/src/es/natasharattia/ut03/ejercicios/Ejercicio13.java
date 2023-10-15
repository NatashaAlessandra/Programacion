package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int x1,x2, y1, y2;

		System.out.println("Introduce x1" );
		x1 = scanner.nextInt();
		System.out.println("Introduce x2" );
		x2 = scanner.nextInt();
		System.out.println("Introduce y1" );
		y1 = scanner.nextInt();
		System.out.println("Introduce y2" );
		y2 = scanner.nextInt();
	
		
		int distancia = ((x2 - x1) + (y2 - y1) * 2);
		System.out.printf("La distancia entre ellos es %f", distancia);
	}	
		

}
