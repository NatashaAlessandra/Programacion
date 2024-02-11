package ejercicio22;

public class Planeador extends VehiculoAereo implements Matriculable{
	
	String matricula;

	public Planeador(String nombrePropietario, int altitudMaxima, String matricula) {
		super(nombrePropietario, altitudMaxima);
		
		this.matricula= matricula;
		
		}
	
	

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}
	

}
