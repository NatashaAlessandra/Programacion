package ejercicio17;

public class Clarinete extends Viento {

	private static final String NOMBRE_INSTRUMENTO = "clarinete";
	private static final int DIFICULTAD = 8;
	private static final Material MATERIAL = Material.MADERA;

	public Clarinete(String propietario) {
		super(DIFICULTAD, propietario, MATERIAL);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}
