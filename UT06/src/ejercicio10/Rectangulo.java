package ejercicio10;

public class Rectangulo {

	public Rectangulo(int base, int altura) {
		
		this.base = base;
		this.altura = altura;
	}
	private final int base;
	public Rectangulo(int base) {
		 
		this.base = base;
	}
	int altura;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
}
