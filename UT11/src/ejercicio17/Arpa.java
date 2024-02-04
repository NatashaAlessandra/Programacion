package ejercicio17;

public class Arpa extends Pulsada{



	private static final String NOMBRE_INSTRUMENTO = "Arpa";
	private static final int DIFICULTAD = 10;
	private static final int NUM_CUERDAS = 47;

	public Arpa(String propietario) {
		super(NUM_CUERDAS, DIFICULTAD, propietario);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}


