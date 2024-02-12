package ejercicio22;

import java.util.Locale;
import java.util.Random;

import net.datafaker.Faker;


public class Programa {

	private static final int NUM_VEHICULOS = 4;

	private static Faker faker = new Faker(new Locale("es"), new Random());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo[] vehiculos = crearVehiculos(10);
		
		mostrarVehiculos(vehiculos);
		
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
	}

	public static Vehiculo[] crearVehiculos(int numVehiculos) {
		Vehiculo[] vehiculos = new Vehiculo[numVehiculos];
		for (int i = 0; i < vehiculos.length; i++) {
			vehiculos[i] = crearVehiculosAleatorios();

		}
		return vehiculos;

	}
	
	private static Vehiculo crearVehiculosAleatorios() {

	switch (faker.random().nextInt(NUM_VEHICULOS)) {
	
	case 0: return new Bicicleta(faker.name().fullName(), 2);
	
	case 1: return new Ultraligero(faker.name().fullName(), 8 , faker.regexify("[A-Z]{2}[0-9]{3}"), 8, "120W");
	
	case 2: return new Planeador(faker.name().fullName(), 700, faker.regexify("[A-Z]{2}[0-9]{3}"));
	
	case 3: return new Camion(faker.name().fullName(), 6, 1000, faker.regexify("[A-Z]{2}[0-9]{3}"), "2000");
	}
	return null;
		
		
	}
	
	private static void mostrarVehiculos(Vehiculo[] vehiculos) {
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
			
		} 
		{
			
		}
	}

}
