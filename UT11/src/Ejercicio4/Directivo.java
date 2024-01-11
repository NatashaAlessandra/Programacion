package Ejercicio4;

public class Directivo extends Empleado{

	public Directivo() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Directivo(String nombre) {
		super(nombre);
		
	}
	@Override
	public String toString() {
		return String.format(" Empleado %s -> %s",this.getNombre(), this.getClass().getSimpleName());
		
	}
	
}
