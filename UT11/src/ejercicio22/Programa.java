package ejercicio22;

//import java.util.Random;
//
//import net.datafaker.Faker;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camion a = new Camion("Pepito", 6, 1000, "A123", "2000");
		System.out.printf("Matricula del camión: '%s'\n", a.getMatricula());

		Planeador b = new Planeador("Manolo", 700, "B456");
		System.out.printf("Propietario es: '%s', la altitud máxima es de: '%d' y la matricula es:'%s'\n ",
				b.getNombrePropietario(), b.getAltitudMaxima(), b.getMatricula());

		Bicicleta c = new Bicicleta("Juan", 2);
		System.out.printf("Propietario: '%s' y el número de ruedas es: '%d'\n", c.getNombrePropietario(),
				c.getNumRuedas());
		
		Ultraligero d = new Ultraligero("Pepito", 6, "A678", 6, "115W");
		System.out.printf("Matricula del Ultraligero: '%s' y la potencia es '%s'\n", d.getMatricula(), d.getPotencia());

//		Random rnd = new Random();
//		Faker faker = new Faker();

	}
}
