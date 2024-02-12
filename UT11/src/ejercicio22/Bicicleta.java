package ejercicio22;

public class Bicicleta extends VehiculoTerrestre {

	public Bicicleta(String nombrePropietario, int numRuedas) {
		super(nombrePropietario, numRuedas);
		if (numRuedas != 2) {
			throw new IllegalArgumentException("El número de ruedas es incorrecto");
		}
	}

	@Override
	public String toString() {
		return "Bicicleta [NumRuedas= " + getNumRuedas() + ", NombrePropietario= " + getNombrePropietario()
				+ "]";
	}

}
