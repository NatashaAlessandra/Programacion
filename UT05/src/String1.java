
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(insertarGuionesCadena("101 Dálmatas"));
	}

	private static String insertarGuionesCadena(String cadena) {
		
		if (cadena == null) {
			return null;
		}
			String cadenaResultado= "";
			for (int izq = 0; izq < cadena.length(); izq++) {
				if (izq > 0) {
					cadenaResultado = cadenaResultado + '-';
				}
				
				cadenaResultado = cadenaResultado +cadena.charAt(izq);
			}
			
		return cadenaResultado;

	}
}