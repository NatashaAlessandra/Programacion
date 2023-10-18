package condicionales;

import java.util.Scanner;

public class EjercicioWhile26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = 5;
		while (num1 != 0) {
			System.out.println("Escribe un número entero, cero para terminar");
		num1 = scanner.nextInt();
			System.out.printf("El numero introducido es %d\n", num1);
		}
		System.out.println("Fin del programa");
		//while (num1 == 0)
			//System.out.println("Hemos terminado,! El número introducido es 0");
		//if (num1 != 0) {
			//System.out.println(num1);
			//num1++;
		}
		
	}


