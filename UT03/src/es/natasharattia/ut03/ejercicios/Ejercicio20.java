package es.natasharattia.ut03.ejercicios;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaLarga = ("Este es el grupo DM1E, estamos en la clase de programación");
		System.out.printf("La posición de la cadena central %s\n", cadenaLarga.length());
		System.out.printf("El valor medio de esta frase es %s\n", cadenaLarga.length()/2);
		System.out.println(cadenaLarga.substring(0, 29));
		System.out.printf(cadenaLarga.substring(29, 58));
	}

}
