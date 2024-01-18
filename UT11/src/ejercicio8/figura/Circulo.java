package ejercicio8.figura;

public class Circulo extends Figura {

	private double radio;

	public Circulo(double radio) {
		this.radio=radio;
	}
	

	public double perimetro() {
		return 2*Math.PI * radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radio*radio;
	}
}
