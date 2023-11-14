import java.util.Random;

public class Ejercicio8Arrays {

	private static final int CANTIDAD_NUMEROS = 20;
	private static final int MIN = 20;
	private static final int MAX = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros = 0;
		int
		llenarConAleatorios(numeros, MIN, MAX);
		
		
	}
	
	private static void llenarConAleatorios (int[] numeros, int min, int max) {
		
		Random rnd = new Random ();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] =rnd.nextInt(min, max);
			System.out.println("Numeros random");
		} 
}
	private static int calcularSumaPosicionesImpares (int[] numeros) {
		int  suma =0;
		
		for (int i = 0; i < numeros.length; i+=2) {
			suma += numeros[i];
			
		}
		return suma;
	}
}