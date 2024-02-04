package ejercicio17;

public class Trompeta extends Viento {

	private static final String NOMBRE_INSTRUMENTO = "trompeta";
	private static final int DIFICULTAD = 7;
	private static final Material MATERIAL = Material.METAL;

	public Trompeta(String propietario) {
		super(DIFICULTAD, propietario, MATERIAL);

	}

	@Override
	public String getNombreInstrumento() {
		return NOMBRE_INSTRUMENTO;
	}

}
