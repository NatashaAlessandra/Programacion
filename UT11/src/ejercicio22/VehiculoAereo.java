package ejercicio22;

public abstract class VehiculoAereo extends Vehiculo {

	private static final int MAX_ALTITUD_MAXIMA = 1000;
	private static final int MIN_ALTITUD_MAXIMA = 100;
	private int altitudMaxima;

	public VehiculoAereo(String nombrePropietario, int altitudMaxima) {
		super(nombrePropietario);
		if (altitudMaxima < MIN_ALTITUD_MAXIMA  || altitudMaxima > MAX_ALTITUD_MAXIMA)
		this.altitudMaxima = 0;

	}

	public int getAltitudMaxima() {
		return altitudMaxima;
	}
}
