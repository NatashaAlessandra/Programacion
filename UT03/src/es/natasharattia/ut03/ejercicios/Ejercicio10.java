package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double precioCompra;
		
		System.out.println("Introduce el precio del producto");
		precioCompra = scanner.nextDouble();
		
		double precioFinal =  precioCompra * 0.85;
		System.out.printf("El total a pagar es de %.2f.: ", precioFinal);
		scanner.close();
	}

}
