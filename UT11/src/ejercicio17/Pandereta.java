package ejercicio17;

public class Pandereta extends Percusión {

	private static final String NOMBRE_INSTRUMENTO = "pandereta";
	private static final int DIFICULTAD = 4;
	

	public Pandereta(String propietario) {
		super(DIFICULTAD, propietario);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}
