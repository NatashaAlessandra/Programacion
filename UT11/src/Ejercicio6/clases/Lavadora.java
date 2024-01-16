package Ejercicio6.clases;

public class Lavadora extends Electrodomestico {
	private static final double CARGA_DEFECTO =5;
	
	private double carga;
	
	public Lavadora() {
		super();
		this.carga=CARGA_DEFECTO;
	}

	public Lavadora(double precioBase, double pesoKg) {
		super(precioBase, pesoKg);
		this.carga=CARGA_DEFECTO;
	}

	public Lavadora(Color color, double precioBase, Consumo consumoEnergetico, double pesoKg, double carga) {
		super(color, precioBase, consumoEnergetico, pesoKg);
		this.carga=carga;
	}
	
	@Override
	public double getPrecioFinal() {
		// TODO Auto-generated method stub
		return super.getPrecioFinal();
	}
}


