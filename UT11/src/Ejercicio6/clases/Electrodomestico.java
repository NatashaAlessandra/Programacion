package Ejercicio6.clases;

import javax.management.RuntimeErrorException;
import javax.swing.event.SwingPropertyChangeSupport;

public class Electrodomestico {
	private static final Color COLOR_DEFECTO = Color.BLANCO;
	private static final double PRECIO_BASE = 100;
	private static final double PESO_KG = 5;
	private static final Consumo CONSUMO = Consumo.F;

	private Color color;
	private double precioBase;
	private Consumo consumo;
	private double pesoKg;

	public Electrodomestico() {
		this.color = COLOR_DEFECTO;
		this.precioBase = PRECIO_BASE;
		this.pesoKg = PESO_KG;
		this.consumo = CONSUMO;

	}

	public Electrodomestico(double precioBase, double pesoKg) {
		super();
		this.precioBase = precioBase;
		this.pesoKg = pesoKg;
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO;

	}

	public Electrodomestico(Color color, double precioBase, Consumo consumoEnergetico, double pesoKg) {
		super();
		this.color = color;
		this.precioBase = precioBase;
		this.consumo = consumoEnergetico;
		this.pesoKg = pesoKg;
	}

	double getPrecioBase() {
		return precioBase;
	}

	public double getPrecioFinal() {
		double precioFinal = this.precioBase;
		precioFinal += calcularIncrementoPorConsumo();
		precioFinal += calcularIncrementoPorPeso();
		return precioFinal;
	}

	private double calcularIncrementoPorPeso() {

		if (this.pesoKg >= 80) {

		}
		if (pesoKg >= 50) {
			return 80;
		}
		if (pesoKg >= 20) {
			return 50;
		}
		return 10;
	}

	private double calcularIncrementoPorConsumo() {
		switch (this.consumo) {
		case A:
			return 100;
		case B:
			return 80;
		case C:
			return 60;
		case D:
			return 50;
		case E:
			return 30;
		case F:
			return 10;
		default:
			throw new RuntimeException("Valor válido en enumerado");
		}
		
	}
}
