package StringsExcepciones;

import java.util.Scanner;

/**
 * 
 * @author Daniel
 *
 */
public class Ejercicio2 {
	/**
	 * <b>Método</b> que pone <b>mayúsculas</b> cuando es necesario.
	 */
	public String Mayusc() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena :");
		String c = sc.nextLine();

		boolean esMayusc = true;
		char[] letras = c.toCharArray();
		letras[0] = Character.toUpperCase(letras[0]);

		for (int i = 0; i < c.length(); i++) {
			if (letras[i] == '.') {
				letras[i + 1] = Character.toUpperCase(letras[i + 1]);
				esMayusc = true;
			} else if (esMayusc && Character.isWhitespace(c.charAt(i))) {
				letras[i + 1] = Character.toUpperCase(letras[i + 1]);
			}

		}
		return new String(letras);
	}

	/**
	 * @param args
	 *            Método <b>main</b>
	 */
	public static void main(String[] args) {
		Ejercicio2 x = new Ejercicio2();
		System.out.println(x.Mayusc());
	}

}
