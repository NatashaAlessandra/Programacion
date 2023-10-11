package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cuál es la base de un rectángulo?"); 
		double numeroBase =scanner.nextDouble();
		System.out.println("¿Cual es altura de un rectángulo?");
		double numeroAltura =scanner.nextDouble();
		double perimetro = 2 * (numeroBase + numeroAltura);
		double area = (numeroBase * numeroAltura);
		System.out.println("El perimetro es:" + perimetro);
		System.out.println("El area es:" + area);
		scanner.close(); 
		
		
	}

}
