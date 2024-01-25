package Ejercicio12;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coche c = new coche (5);
		c.acelerar(30);
		c.acelerar(80);
		c.acelerar(50);
		c.frenar(25);
		c.frenar(90);
		c.aparcar();
		System.out.println("-".repeat(100));
		
		moto n =new moto(2);
		n.acelerar(60);
		n.acelerar(65);
		n.frenar(35);
		
	}

}
