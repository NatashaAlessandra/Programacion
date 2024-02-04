package ejercicio17;

public class Tuba extends Viento {

	private static final String NOMBRE_INSTRUMENTO = "tuba";
	private static final int DIFICULTAD = 8;
	private static final Material MATERIAL = Material.METAL;

	public Tuba(String propietario) {
		super(DIFICULTAD, propietario, MATERIAL);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}
