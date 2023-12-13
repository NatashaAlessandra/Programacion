
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(insertarGuionesCadena("101 Dálmatas"));
		System.out.println(insertarGuionesCadena2("101 Dálmatas"));
	}

	private static String insertarGuionesCadena(String cadena) {

		if (cadena == null) {
			return null;
		}
		String cadenaResultado = "";
		for (int izq = 0; izq < cadena.length(); izq++) {
			if (izq > 0) {
				cadenaResultado = cadenaResultado + '-';
			}

			cadenaResultado = cadenaResultado + cadena.charAt(izq);
		}

		return cadenaResultado;

	}

	private static String insertarGuionesCadena2(String cadenaOriginal) {
		if (cadenaOriginal == null) {
			return null;
		}

		char[] caracteresOriginal = cadenaOriginal.toCharArray();
		char[] caracteresResultado = new char[(caracteresOriginal.length * 2) - 1];
		for (int posOrigen = 0; posOrigen < cadenaOriginal.length(); posOrigen++) {
			int posDestino = posOrigen * 2;
			caracteresResultado[posDestino] = caracteresOriginal[posOrigen];
			if (posDestino < 0) {
				caracteresResultado[posDestino - 1] = '-';
			}

		}
		return String.valueOf(caracteresResultado);

	}
}
