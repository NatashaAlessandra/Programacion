package Ejercicio6.clases;

public class Television extends Electrodomestico {
	private static final int RESOLUCION_DEFECTO=42;
	private static final boolean SINTONIZADOR_DEFECTO=true;
	
	
	private int resolucionPulgadas;
	private boolean sintonizacionTdt;
	
	

	
	public Television() {
		super();
		this.resolucionPulgadas = RESOLUCION_DEFECTO;
		this.sintonizacionTdt = SINTONIZADOR_DEFECTO;
	}


	public Television(Color color, double precioBase, Consumo consumoEnergetico, double pesoKg) {
		super(color, precioBase, consumoEnergetico, pesoKg);
		
	}


	public Television(double precioBase, double pesoKg) {
		super(precioBase, pesoKg);
		this.resolucionPulgadas = RESOLUCION_DEFECTO;
		this.sintonizacionTdt = SINTONIZADOR_DEFECTO;
	
	}


	@Override
	public double getPrecioFinal() {
		double precioFinal = super.getPrecioFinal();
		precioFinal+=calcularIncrementoPorPulgadas();
		precioFinal+=calcularIncrementoPorSintonizador();
		
		return super.getPrecioFinal();
	}


	private double calcularIncrementoPorSintonizador() {
		
		return 0;
	}


	private double calcularIncrementoPorPulgadas() {
		if (this.resolucionPulgadas >65) {
			
		}
		return 0;
	}

}
