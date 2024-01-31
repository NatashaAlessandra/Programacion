package ejercicio17;

public class Violin extends Frotada {

	private static final String NOMBRE_INSTRUMENTO = "violin";
	private static final int DIFICULTAD = 9;
	private static final int NUM_CUERDAS = 4;

	public Violin(String propietario) {
		super(NUM_CUERDAS, DIFICULTAD, propietario);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}
