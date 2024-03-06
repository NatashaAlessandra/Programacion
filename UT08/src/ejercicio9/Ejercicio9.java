package ejercicio9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Ejercicio9 {

	public static void main(String[] args) {
	Random random = new Random();
	
	List<Integer> numAleatorios = new ArrayList();
		for (int i = 0; i < 1001; i++) {
			numAleatorios.add(random.nextInt(1,50));
			
			
		}
		System.out.println(numAleatorios);	
		
		Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		 mapa.isEmpty();
		 System.out.println(mapa);

		
		for (Integer integer : numAleatorios) {
			 
		}
	
		
	
	}

}
