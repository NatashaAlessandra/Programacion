package es.natasharattia.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	//Crea un programa en Java que tenga sólo el método main, y en este método
	//•	Crea un objeto de tipo String. Se puede hacer simplemente con 
	// 		String cadena = "   Frase que quiero que esté en la cadena   ";
	//•	Incluye espacios al principio y el final de la cadena para poder hacer pruebas.
	//•	Calcula su longitud usando el método "length()", y muéstrala en consola.
	//•	Usa el método "toLowerCase()" para crear una segunda cadena que esté en minúsculas, a partir de la primera, y muéstrala en la consola.
	//•	Usa el método "trim()" (elimina espacios delante y detras) para crear una tercera cadena a partir de la primera y muéstrala en consola.
	//•	Usa de nuevo el método length(), pero esta vez sobre la tercera cadena, que no tendrá espacios al principio y fin, y comprueba si la longitud es la correcta

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto, con espacios al principio y al final");
		String cadena1 = scanner.nextLine();
		int longitud = cadena1.length();
		System.out.printf(" La longitud de la cadena es de %s es de %d caracteres\n", cadena1, longitud);
		String cadenaMin = cadena1.toLowerCase();
		System.out.printf("La cadena en minusculas es '%s'\n", cadenaMin);
		String cadenaSinEspacios = cadena1.trim();
		int longitudSinEspacios = cadenaSinEspacios.length();
		System.out.printf("La longitud de la cadena '%s' es de %d caracteres.\n ", cadenaSinEspacios, longitudSinEspacios);
		
		
	}

}

