package ejercicio17;

public abstract class Instrumento {
	
	String propietario;
	int dificultad;
	
	public abstract void tocar();

	public abstract void parar();
	
	public boolean esMasDificil(Instrumento instrumento) {
		return true;
		
	}

	public Instrumento(int dificultad) {
		super();
		this.dificultad = dificultad;
	}

	public Instrumento(String propietario, int dificultad) {
		super();
		this.propietario = propietario;
		this.dificultad = dificultad;
	}

	public String getPropietario() {
		return propietario;
	}

	public int getDificultad() {
		return dificultad ;
	}
}
