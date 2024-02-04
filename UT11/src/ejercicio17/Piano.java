package ejercicio17;

public class Piano extends Percutida{



	private static final String NOMBRE_INSTRUMENTO = "Piano";
	private static final int DIFICULTAD = 7;
	private static final int NUM_CUERDAS = 230;

	public Piano(String propietario) {
		super(NUM_CUERDAS, DIFICULTAD, propietario);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}


