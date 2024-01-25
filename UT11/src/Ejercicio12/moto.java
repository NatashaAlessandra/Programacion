package Ejercicio12;

public class moto implements Vehiculo {
	
	public static final int NUMERO_PLAZAS = 2;
	
	
	private int velocidad;

	
	public moto(int numPlazas) {
		velocidad=0;
	}

	@Override
	public void frenar(int cuanto) {
		this.velocidad -= cuanto;
		if (this.velocidad < 0) {

		}
		System.out.printf("Soy una moto y freno hasta %d km /h \n", velocidad);

	}

	@Override
	public void acelerar(int cuanto) {
		this.velocidad += cuanto;
		if (this.velocidad > VELOCIDAD_MAXIMA) {
			this.velocidad = VELOCIDAD_MAXIMA;

		}
		System.out.printf("Soy una moto y acelero hasta %d km /h \n", velocidad);

	}

	@Override
	public int getNumPlazas() {
		
		return NUMERO_PLAZAS;
	}

}
