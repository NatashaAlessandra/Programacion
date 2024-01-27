package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static final int MINUTOS = 60;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una cantidad de minutos ");
		int totalMinutos = scanner.nextInt();
		int horas = totalMinutos / MINUTOS;
		int minutos = totalMinutos % MINUTOS;
		
		System.out.printf("En %d minutos hay %d horas y %d minutos\n", totalMinutos, horas, minutos);
		scanner.close();
	}

}
