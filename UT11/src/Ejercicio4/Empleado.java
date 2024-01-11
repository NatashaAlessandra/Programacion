package Ejercicio4;

public class Empleado {

	private String nombre;

	public Empleado() {
		super();
		this.nombre = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {

		return String.format("Empleado %s", this.nombre);
	}

}
