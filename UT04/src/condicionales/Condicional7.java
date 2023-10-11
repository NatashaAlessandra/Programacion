package condicionales;

import java.util.Scanner;

public class Condicional7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu nota");
		int nota = scanner.nextInt();
		System.out.println("Introduce tu edad");
		int edad = scanner.nextInt();
		System.out.println("Introduce tu sexo");
		String sexo = scanner.next();
		//si quieres comparar string no puedes usar "==" tiene que ser .equals)(
		
		
		
	if ((nota >= 5) && (edad >=18 ) && sexo.equals("F")) {
		System.out.println("ACEPTADA");	
	
	} else if ((nota >= 5) && (edad >= 18) && (sexo.equals("M"))) {
	 System.out.println("POSIBLE");
	}
		
		
	if ((nota < 5) && (edad < 18)) {
		System.out.println("NO ACEPTADA");
	
	}
}
}