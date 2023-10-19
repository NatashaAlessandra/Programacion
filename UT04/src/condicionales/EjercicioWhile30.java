package condicionales;

import java.util.Scanner;

public class EjercicioWhile30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
		// int numero=0;
//		System.out.println("Las tablas de multiplicar");
//		numero = scanner.nextInt();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Tabla de multiplicar del " + i + ":");
			for (int n = 1; n <= 10; n++) {


				System.out.println(i + " x " + n + " = " + (i * n));
			}

		}
	}
}