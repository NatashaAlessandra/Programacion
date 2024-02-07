package ejercicio17;

public abstract class Instrumento {
	
	String propietario;
	int dificultad;
	
	public void tocar() {
		System.out.printf("El intrumento %s empieza a sonar \n", getNombreInstrumento() );
	
	}
	public abstract String getNombreInstrumento();

	public void parar() {
		System.out.printf("El instrumento %s para de tocar \n", getNombreInstrumento() );
	}
	
	public boolean esMasDificil(Instrumento instrumento) {
		if (this.dificultad > instrumento.dificultad) {
			System.out.printf("El instrumento %s es mas dificil que %s \n", this.getNombreInstrumento(), instrumento.getNombreInstrumento() );	
		}
		return true;
		
	}

	public Instrumento(int dificultad, String propietario) {
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
