package ejercicio22;

import javax.management.RuntimeErrorException;

public abstract class Vehiculo {

	private String nombrePropietario;

	public Vehiculo(String nombrePropietario) {
		if (nombrePropietario == null || nombrePropietario.isBlank())

			this.nombrePropietario = nombrePropietario;
		throw new RuntimeErrorException(null, "El nombre del propietario no puede ser nulo");
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}
}
