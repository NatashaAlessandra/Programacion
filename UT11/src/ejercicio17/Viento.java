package ejercicio17;

public abstract class Viento extends Instrumento {
	
	Material material;

	public Viento(int dificultad, String propietario, Material material) {
		super(dificultad, propietario);
		this.material= material;
		
	

	}

}
