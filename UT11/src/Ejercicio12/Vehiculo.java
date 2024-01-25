package Ejercicio12;

public interface Vehiculo {

	int VELOCIDAD_MAXIMA = 120;
	int VELOCIDAD_MININA=0;

	void frenar(int cuanto);

	

	void acelerar(int cuanto);

	int getNumPlazas();
}
