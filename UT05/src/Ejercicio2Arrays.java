import java.util.Scanner;

public class Ejercicio2Arrays {

	private static final CONSTANTE_CADENA = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] nombres = new String; 
		
		for (int pos=0; pos < nombres.length ; pos++) {
		System.out.println("Introduce el nombre");
		String nombre = scanner.nextLine();
		nombres[pos]= nombre;
		
		}
		

		
	}

}
