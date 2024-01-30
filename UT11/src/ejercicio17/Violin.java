package ejercicio17;

public abstract class Violin extends Frotada {

	public Violin(int numeroCuerdas, int dificultad) {
		super(numeroCuerdas, dificultad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dificultad"+dificultad+", "+numeroCuerdas+" cuerdas";
	}
	

}
