package ejercicio17;

public class Xilofono extends Percusión {

	private static final String NOMBRE_INSTRUMENTO = "xilofono";
	private static final int DIFICULTAD = 8;
	

	public Xilofono(String propietario) {
		super(DIFICULTAD, propietario);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}
