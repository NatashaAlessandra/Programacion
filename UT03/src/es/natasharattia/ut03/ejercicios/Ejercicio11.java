package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	final static double PORCENTAJE_PARCIAL = 0.55;
	final static double PORCENTAJE_EXAMEN_FINAL = 0.30;
	final static double PORCENTAJE_TRABAJO_FINAL = 0.15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce la primera nota" );
		double nota1 = scanner.nextDouble();
		System.out.println("Introduce la segunda nota ");
		double nota2 = scanner.nextDouble();
		System.out.println("Introduce la tercera nota");
		double nota3 = scanner.nextDouble();
		double notasParciales = (nota1 + nota2 + nota3)/3 * PORCENTAJE_PARCIAL;
		System.out.printf("El promedio de notas parciales es %.2f\n", notasParciales);
		
		System.out.println("Introduce la nota final del examen final");
		double notaExamen = scanner.nextDouble();
		System.out.println("Introduce nota del trabajo final");
		double notaTrabajo = scanner.nextDouble();
		

		
		double notaFinalexamen = notaExamen * PORCENTAJE_EXAMEN_FINAL;
		double notaTrabajofinal = notaTrabajo * PORCENTAJE_TRABAJO_FINAL;
		
		double calificacionFinal = notasParciales + notaFinalexamen + notaTrabajofinal;
		System.out.printf("La calificación final en la materia de algoritmos y estructuras de datos es de %.2f ", calificacionFinal);
		
		
		

		
		
		
	}

}
