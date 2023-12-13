import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra = "Hola";
		String palabra2 = "Hola";
		String palabra3 = "Hola";
		
		esPalindromo(palabra);

		String otraPalabra = "arenera";
		System.out.println (esPalindromo("luz azul"));
		
	}

	private static boolean esPalindromo(String cadena) {
//		System.out.println("Escribe una frase");
//		Scanner scanner = new Scanner (System.in);
//		String frase = scanner.next();

		if (cadena == null) {

			return false;
		}
		int inicio = 0;
		int fin = cadena.length() - 1;
		while (inicio < fin) {
			char a = cadena.charAt(fin);
			char b = cadena.charAt(inicio);
			if (a != b) {
				return false;
			}
			inicio++;
			fin--;

		}

		return true;
	}

}
