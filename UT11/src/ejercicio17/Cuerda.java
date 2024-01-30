package ejercicio17;

public abstract class Cuerda extends Instrumento {

	int numeroCuerdas;

	public Cuerda(int numeroCuerdas, int dificultad) {
		super(dificultad);
		this.numeroCuerdas = numeroCuerdas;
	}

	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}

}
