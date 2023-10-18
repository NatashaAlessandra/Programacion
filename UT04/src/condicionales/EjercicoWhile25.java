package condicionales;

import java.util.Scanner;

public class EjercicoWhile25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe un número");
		int numero1 = scanner.nextInt();
		
		for (int m = 1; m <= 10; m++) {
			System.out.println(numero1 +"x"+ m+" = "+numero1*m);
		}
	}

}
