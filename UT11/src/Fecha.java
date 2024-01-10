
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
		if (mes < 1 || mes > 12) {
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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	private boolean esBisiesto(int anio) {
		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
			return true;
		} else {
			return false;
		}

	}
	public String toString() {
		return String.format("%02d-%02d-%04d", dia,mes,anio);
	}
	public void diaSiguiente() {
	}
}
