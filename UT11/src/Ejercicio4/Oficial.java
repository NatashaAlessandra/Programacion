package Ejercicio4;

public class Oficial extends Operario{

	public Oficial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("%s -> %s ", super.toString(), "Oficial");
}
}