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
	 * @return <b> M�todo <b> que devuelve la suma de <b> may�sculas del String
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

		return "La suma de los n�meros es de :" + suma;

	}

	/**
	 * 
	 * @param args
	 *            M�todo main para crear una instancia de clase y llamar al
	 *            m�todo contNum.
	 */
	public static void main(String[] args) {
		Ejercicio1 mio = new Ejercicio1();
		System.out.println(mio.contNum());
	}

}
