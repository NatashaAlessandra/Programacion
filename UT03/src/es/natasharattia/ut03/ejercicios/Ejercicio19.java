package es.natasharattia.ut03.ejercicios;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaLarga = ("Hoy es el día del taco, voy a comer taco hoy");
		String palabra = ("taco");
		
		System.out.printf("La primera aparición de %s sale en la posicion %s\n", palabra, cadenaLarga.indexOf(palabra));
		int ultimaAparicion = cadenaLarga.lastIndexOf(palabra);
		System.out.printf("La ultima aparición de %s sale en la posicion %s\n",palabra, ultimaAparicion);
	}

}
