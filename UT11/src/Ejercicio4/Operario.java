package Ejercicio4;

public class Operario extends Empleado {

	public Operario() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Operario(String nombre) {
		super(nombre);

	}
	@Override
	public String toString() {
		return String.format("Empleado %s -> %s ", this.getNombre(), "Operario");

	}

}