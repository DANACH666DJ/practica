package StringsExcepciones;

import java.util.Scanner;
/**
 * 
 * @author Daniel
 *
 */
public class Ejercicio1 {
	/**
	 * 
	 * @return <b> Método <b> que devuelve la suma de <b> mayúsculas del String
	 *         introducido.
	 * 
	 */
	public String contNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un String :");
		String s = sc.nextLine();
		int numero, suma = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 49 && s.charAt(i) <= 57) {
				numero = Integer.parseInt(s.substring(i, i + 1));
				suma += numero;
			}

		}

		return "La suma de los números es de :" + suma;

	}

	/**
	 * 
	 * @param args
	 *            Método main para crear una instancia de clase y llamar al
	 *            método contNum.
	 */
	public static void main(String[] args) {
		Ejercicio1 mio = new Ejercicio1();
		System.out.println(mio.contNum());
	}

}
