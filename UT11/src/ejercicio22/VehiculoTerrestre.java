package ejercicio22;

public abstract class VehiculoTerrestre extends Vehiculo {
	


	public VehiculoTerrestre(String nombrePropietario, int numRuedas) {
		super(nombrePropietario);
		this.numRuedas = numRuedas;
	}

	private int numRuedas;

	
	
	public int getNumRuedas() {
		return numRuedas;
	}

}
