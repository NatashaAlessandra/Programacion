package Ejercicio12;

public class coche implements Vehiculo {

	private int velocidad;
	private int numPlazas;
	
	public coche(int numPlazas) {
		velocidad=0;
		this.numPlazas = numPlazas;
	}

	@Override
	public void frenar(int cuanto) {
		this.velocidad -= cuanto;
		if (this.velocidad < 0) {

		}
		System.out.printf("Soy un coche y freno hasta %d km /h \n", velocidad);

	}

	@Override
	public void acelerar(int cuanto) {
		this.velocidad += cuanto;
		if (this.velocidad > VELOCIDAD_MAXIMA) {
			this.velocidad = VELOCIDAD_MAXIMA;

		}
		System.out.printf("Soy un coche y acelero hasta %d km /h \n", velocidad);

	}

	@Override
	public int getNumPlazas() {

		return this.numPlazas;
	}
	
	public void aparcar() {
		System.out.println("Voy a aparacar");
	}

}
