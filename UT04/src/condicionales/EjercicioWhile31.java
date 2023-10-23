package condicionales;

import java.util.Scanner;
import java.util.Random;

public class EjercicioWhile31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		
		
		int numeroSecreto = rnd.nextInt(1,100);
		System.out.println("Adivina el número secreto" + numeroSecreto);
		numeroSecreto = scanner.nextInt();
		
		int intentosRestantes = 0;
		for (int intentosRestante = 10; (intentosRestantes > 0) && (intentosRestante != numeroSecreto); intentosRestantes--) { 
		System.out.println("El número introducido no es correcto, es mayor que el número introducido");
		 
		
		
		System.out.println("Has adivinado, ¡Ganaste!");
		
		
		
		
		
	
	}

}
}