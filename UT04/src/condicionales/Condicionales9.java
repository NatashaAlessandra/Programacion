package condicionales;

import java.util.Scanner;

public class Condicionales9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Qué año es?");
		int anio = scanner.nextInt();
		boolean esDivisiblePor4 = anio % 4 == 0;
		
		if ((esDivisiblePor4 && (anio % 100 != 0)) 
				|| (esDivisiblePor4 && anio % 100 == 0 && (anio % 400 == 0))) {
			System.out.printf("El año es bisiesto %d", anio);
		} else {
			System.out.printf("El año no es bisiesto %d", anio);	
		}		
	}		
}
	
