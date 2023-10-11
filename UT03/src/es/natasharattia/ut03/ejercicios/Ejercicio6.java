package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en ºFarenheit (puedes usar decimales)");
		double temperaturaF = scanner.nextDouble();
		
		double temperaturaC = (temperaturaF - 32) * 5/9;
		System.out.printf("%.2f ºF son %.2f ºC.\n", temperaturaF, temperaturaC);
		scanner.close();
	}

}
