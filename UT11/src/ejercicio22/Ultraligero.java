package ejercicio22;

public class Ultraligero extends VehiculoAereo implements Matriculable, Motorizado {

	private double envergadura;
	String matricula;
	String potencia;

	public Ultraligero(String nombrePropietario, int altitudMaxima, String matricula, double envergadura, String potencia) {
		super(nombrePropietario, altitudMaxima);

		this.matricula = matricula;
		this.potencia = potencia;
	}

	public double getEnvergadura() {
		if (envergadura > 5 && envergadura < 20) {
			throw new IllegalArgumentException("La envergadura no puede ser menor a 5 ni inferior a 20 metros");
		}
		return envergadura;

	}

	public void setEnvergadura(double envergadura) {
		this.envergadura = envergadura;
	}

	@Override
	public String getPotencia() {
		// TODO Auto-generated method stub
		return potencia;
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}

	@Override
	public String toString() {
		return "Ultraligero [matricula= " + matricula + ", potencia= " + potencia
				+ ", altitudMaxima= " + altitudMaxima + ", Envergadura= " + getEnvergadura() + ", Potencia= "
				+ getPotencia() + ", Matricula=" + getMatricula() + ", AltitudMaxima=" + getAltitudMaxima()
				+ ", NombrePropietario= " + getNombrePropietario() + "]";
	}

}
