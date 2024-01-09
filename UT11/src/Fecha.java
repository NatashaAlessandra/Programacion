
public class Fecha {

	private int dia = 1;
	private int mes = 1;
	private int anio = 1970;

	public Fecha() {
		this(1, 1, 1970);
	}

	public Fecha(int dia, int mes, int anio) {
		if (anio == 0) {
			throw new IllegalArgumentException("El año no puede ser cero");
		}
		if (mes < 1 || mes > 2) {
			throw new IllegalArgumentException("El mes tiene que ser un número entre 1 y 12 ambos incluidos");
		}

		if (dia < 1) {
			throw new IllegalArgumentException("El dia no puede ser menor que uno");
		}

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia > 31) {
				throw new IllegalArgumentException("El dia no puede ser mayor que 31");
			}
			break;

		case 4, 6, 9, 11:
			if (dia > 30) {
				throw new IllegalArgumentException("El dia no puede ser menor que 30");
			}
			break;
		default:
			if (esBisiesto(anio)) {
				if (dia > 29) {
					throw new IllegalArgumentException("El dia no puede ser mayor que 29");
				}
			} else {
				if (dia > 28) {
					throw new IllegalArgumentException("El dia no puede ser mayor que 28");
				}
			}
		}
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

	}

	private boolean esBisiesto(int anio) {
		
		return false;
	}

}
