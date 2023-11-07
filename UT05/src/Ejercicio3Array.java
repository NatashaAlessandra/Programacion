import java.util.Scanner;

public class Ejercicio3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		pedirCantidadNumeros(1);
		 
	}
	public static int pedirCantidadNumeros (int numerosAProcesar) {
		int cantidad = 0;
	
		System.out.println("Introduce un numero");
		while (cantidad <= 0) {
			System.out.println("El numero tiene que ser mayor que 0");
			if (cantidad > 0) {
				
			}
		}
		
		return numerosAProcesar;
				
		} 

	public static int pedirNumeros (int numerosUsuario) {
		int[] numeros = new int[pedirCantidadNumeros(numerosUsuario)];
		return numerosUsuario;
}
	public static int mostrarNumerosOredenNormal (int numerosOrden) {
		return numerosOrden;
		
	}
	public static int mostrarNumerosOrdenInverso (int numerosInversos) {
		return numerosInversos;
		
	}
}