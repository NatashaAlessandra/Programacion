package ejercicio8.figura;

public abstract class Paralelogramo extends Figura{
	
	private double base;
	private double altura;

	public Paralelogramo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		
	}

	public double getBase() {
		return base;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return base + altura *2;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

}
