package condicionales;

import java.util.Scanner;

public class Condicional4 {
	
	private static final String USUARIO_ESPERADO = "pepe";
	private static final String PASSWORD_ESPERADO = "asdasd";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de usuario");
		String usuario = scanner.nextLine();
		System.out.println("Introduce el password");
		String password = scanner.nextLine();
		
		if (usuario.equalsIgnoreCase (USUARIO_ESPERADO) && password.equalsIgnoreCase (PASSWORD_ESPERADO));
	}

}
