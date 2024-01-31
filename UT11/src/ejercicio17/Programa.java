package ejercicio17;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Violin a = new Violin("Alvaro");
		a.tocar();
		a.parar();
		
		
		Violonchelo b = new Violonchelo("Natasha");
		b.tocar();
		b.parar();
		b.esMasDificil(a);
		
	}

}
