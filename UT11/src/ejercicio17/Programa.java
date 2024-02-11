package ejercicio17;

import java.util.Locale;
import java.util.Random;
import net.datafaker.Faker;

public class Programa {

	private static final int NUMERO_INSTRUMENTOS = 12;

	private static Faker faker = new Faker(new Locale("es"), new Random());
	public static void main(String[] args) {
		
	
		Violin a = new Violin("Alvaro");
		a.tocar();
		a.parar();

		Violonchelo b = new Violonchelo("Natasha");
		b.tocar();
		b.parar();
		b.esMasDificil(a);

		Xilofono c = new Xilofono("Pepe");
		c.tocar();
		c.tocar();
		c.parar();
		c.esMasDificil(a);

	}

	public static Instrumento[] crearInstrumento(int cuantos) {
		Instrumento[] instrumentos = new Instrumento[cuantos];
		for (int i = 0; i < instrumentos.length; i++) {
			instrumentos[i] = crearInstrumentosAleatorios();

		}

		return instrumentos;
	}
	
//	public static tocarInstrumentos();
//	public static pararInstrumentos();
//	public static buscarMasDificil();
//	public static mostrarInstrumentos();

	private static Instrumento crearInstrumentosAleatorios() {
		switch (faker.random().nextInt(NUMERO_INSTRUMENTOS)) {
		case 0: {
			
		
		}

		}
		return null;
	}
}
