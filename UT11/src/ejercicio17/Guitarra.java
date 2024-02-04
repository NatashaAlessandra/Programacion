package ejercicio17;

public class Guitarra extends Pulsada{



	private static final String NOMBRE_INSTRUMENTO = "Guitarra";
	private static final int DIFICULTAD = 7;
	private static final int NUM_CUERDAS = 6;

	public Guitarra(String propietario) {
		super(NUM_CUERDAS, DIFICULTAD, propietario);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}


