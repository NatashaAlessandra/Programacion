package ejercicio17;

public class Timbales extends Percusión {

	private static final String NOMBRE_INSTRUMENTO = "timbales";
	private static final int DIFICULTAD = 6;
	

	public Timbales(String propietario) {
		super(DIFICULTAD, propietario);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}
