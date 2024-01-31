package ejercicio17;

public abstract class Cuerda extends Instrumento {

	int numeroCuerdas;

	public Cuerda(int numeroCuerdas, int dificultad, String propietario) {
		super(dificultad, propietario);
		this.numeroCuerdas = numeroCuerdas;
	}

	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}

}
