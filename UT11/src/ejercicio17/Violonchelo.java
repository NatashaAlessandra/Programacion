package ejercicio17;

public class Violonchelo extends Frotada{



	private static final String NOMBRE_INSTRUMENTO = "violonchelo";
	private static final int DIFICULTAD = 10;
	private static final int NUM_CUERDAS = 5;

	public Violonchelo(String propietario) {
		super(NUM_CUERDAS, DIFICULTAD, propietario);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}


