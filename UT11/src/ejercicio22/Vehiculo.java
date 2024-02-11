package ejercicio22;

public abstract class Vehiculo {

	private String nombrePropietario;

	public Vehiculo(String nombrePropietario) {
		if (nombrePropietario == null || nombrePropietario.isBlank())

			throw new IllegalArgumentException("El nombre del propietario no puede ser nulo");
		this.nombrePropietario = nombrePropietario;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}
}
