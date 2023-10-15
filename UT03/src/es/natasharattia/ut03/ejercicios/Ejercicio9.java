package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double sueldoBase;
		double primeraVenta, segundaVenta, terceraVenta;
		

	
		System.out.println("Introduce el sueldo base: ");
		sueldoBase = scanner.nextDouble();
		System.out.println("Introduce primera venta: ");
		primeraVenta = scanner.nextDouble();
		System.out.println("Introduce segunda venta: ");
		segundaVenta = scanner.nextDouble();
		System.out.println("Introduce tercera venta: ");
		terceraVenta = scanner.nextDouble();
		
		
		
		double sueldoFinal = sueldoBase + (primeraVenta + segundaVenta + terceraVenta) * 0.10;
		System.out.printf("El sueldo final es %.2f\n", sueldoFinal); 
				//primeraVenta, segundaVenta, terceraVenta + sueldoBase, sueldoFinal);
		
	}

}
