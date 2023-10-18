package condicionales;

import java.util.Scanner;

public class CondicionalesWhile28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int cantidad0 = 0;
		int cantidadPositivos = 0 ;
		int cantidadNegativos= 0;
		
		System.out.println("Cúantos números vamos a procesar?");
		num = scanner.nextInt();
		for (int i = 0; i < num; i++) { // (inicialización; expresión-lógica; iteracción)
			//

			System.out.println("Introduce un número: ");
			int numero = scanner.nextInt();
			if (numero < 0) {
				cantidadNegativos++;
			} else if (numero == 0)  {
				cantidad0++;
			} else {
				cantidadPositivos++;
			}
			
			System.out.printf("En los numeros introducidos había %d negativos, %d números de 0 , %d de positivos \n", cantidadNegativos, cantidad0, cantidadPositivos);
		}
			System.out.println("Fin del programa");
	}
}

//		int cantidadNum= 0;
//		
//		int numNegativo = 0;
//
//		System.out.println("Cúantos números vamos a procesar?");
//		cantidadNum = scanner.nextInt();
//		System.out.println("Introduce un número: ");
//		int numPositivo = 0;
//		while (numPositivo > cantidadNum) {
//			  cantidadNum++;
//			  System.out.println("La cantidad de número positivo es de: ");
//	    while (numNegativo < cantidadNum);
//	    	  System.out.println("La cantidad de número negativo es de: ");
//	   
//	    do {
//	    	System.out.println("La cantidad de 0 se han introducido");
//	    }
//		}
//	}}
//
//
//	int num1 = 10;
//
//	while(num1<20)
//	{
//		System.out.println(num1);
//		num1++;
//	}while(num1<20);
//		for (int i = 0; i < cantidadNum; i++) {
//		
//			System.out.println("Introduce un número: ");
//			int numero = scanner.nextInt();
//			if (numero < 0) {
//				System.out.println("El numero introducido es menor que 0");
//			} else if (numero == 0) {
//				System.out.println("El número introducido es igual que 0");
//			} else {
//				System.out.println("El número introducido es mayor que 0");  

//}

//}

//		do {
//			System.out.printf("La cantidad de 0 es %d: ", cantidadNum);
//		} while (negativo < 0);
//			System.out.println(negativo);
//			negativo++
//			
//	}
//}
