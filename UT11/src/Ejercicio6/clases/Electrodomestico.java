package Ejercicio6.clases;

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
		this.color =COLOR_DEFECTO;
		this.precioBase = PRECIO_BASE;
		this.pesoKg= PESO_KG;
		this.consumo=CONSUMO;
	
	}

	public Electrodomestico(double precioBase, double pesoKg) {
		super();
		this.precioBase = precioBase;
		this.pesoKg = pesoKg;
		this.color =COLOR_DEFECTO;
		this.consumo=CONSUMO;
		
	}

	public Electrodomestico(Color color, double precioBase, Consumo consumoEnergetico, double pesoKg) {
		super();
		this.color = color;
		this.precioBase = precioBase;
		this.consumo = consumoEnergetico;
		this.pesoKg = pesoKg;
	}

	public double getPrecioFinal() {
		double precioFinal=this.precioBase;
		// TODO:Calcular el precio final
		return precioFinal;
	}
}
