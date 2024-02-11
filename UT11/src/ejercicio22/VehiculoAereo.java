package ejercicio22;

public abstract class VehiculoAereo extends Vehiculo {

	private static final int MAX_ALTITUD_MAXIMA = 10000;
	private static final int MIN_ALTITUD_MAXIMA = 100;
	int altitudMaxima;

	public VehiculoAereo(String nombrePropietario, int altitudMaxima) {
		super(nombrePropietario);
		if (altitudMaxima < MIN_ALTITUD_MAXIMA && altitudMaxima > MAX_ALTITUD_MAXIMA)
			throw new IllegalArgumentException("La altitud no puede ser menor a 100 ni mayor a 10000");
		this.altitudMaxima = altitudMaxima;

	}



	public int getAltitudMaxima() {
		return altitudMaxima;
	}
}
