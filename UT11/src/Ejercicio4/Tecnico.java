package Ejercicio4;

public class Tecnico extends Operario {

	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tecnico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("%s -> %s ", super.toString(), "Tecnico");

	}
}
