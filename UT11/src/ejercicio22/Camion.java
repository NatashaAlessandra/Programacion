package ejercicio22;

public class Camion extends VehiculoTerrestre implements Matriculable, Motorizado {

	String matricula;
	int cargaMaxima;
	String potencia;

	public Camion(String nombrePropietario, int numRuedas, int cargaMaxima, String matricula, String potencia) {
		super(nombrePropietario, numRuedas);
		if (numRuedas < 4 || numRuedas > 16) {
			throw new IllegalArgumentException("El número de ruedas es incorrecto");
		}
		if (cargaMaxima < 0 && cargaMaxima > 40000) {
			throw new IllegalArgumentException("La carga máxima es incorrecta");
		}

		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
		this.potencia = potencia;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}

	@Override
	public String getPotencia() {
		// TODO Auto-generated method stub
		return null;
	}

}
