package es.natasharattia.ut03.ejercicios;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 =" Frase que quiero que este en la cadena ";
			System.out.printf(" La longitud de la cadena es de %s\n", cadena1.length());
			System.out.println(cadena1.toLowerCase());
			System.out.println(cadena1.trim());
			String cadena2 = cadena1.trim();
			System.out.println(cadena2.length());
	}

}
