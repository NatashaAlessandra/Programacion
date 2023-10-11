package condicionales;

import java.util.Scanner;

public class Condicional8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int numero1 = scanner.nextInt();
		System.out.println("Introduce el segundo numero");
		int numero2 = scanner.nextInt();
		System.out.println("Introduce el tercer numero");
		int numero3 = scanner.nextInt();
		

		{
			if ((numero1 >= numero2) && (numero1 >=numero3) && (numero2 >= numero3)) 
			System.out.printf("El orden de los numeros es %d, %d, %d", numero1, numero2, numero3);	
		 else if  ((numero1 >= numero2) && (numero1 >=numero3) 
				&& (numero1 < numero3)) 
			System.out.printf("El orden de los numeros es %d, %d, %d", numero1, numero2, numero3);	
		else if ((numero3 >= numero1) && (numero3 >=numero2) 
				&& (numero2 < numero1)) 
			System.out.printf("El orden de los numeros es %d, %d, %d", numero1, numero2, numero3);
		else if ((numero3 >= numero1) && (numero3 >=numero2) 
				&& (numero2 < numero1)) 
			System.out.printf("El orden de los numeros es %d, %d, %d", numero1, numero2, numero3);
			
	}
			
  }
}


