package ejercicio17;

public class Flauta extends Viento {

	private static final String NOMBRE_INSTRUMENTO = "flauta";
	private static final int DIFICULTAD = 6;
	private static final Material MATERIAL = Material.MADERA;

	public Flauta(String propietario) {
		super(DIFICULTAD, propietario, MATERIAL);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}
