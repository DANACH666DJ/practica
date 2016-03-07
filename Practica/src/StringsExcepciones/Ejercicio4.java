package StringsExcepciones;

import java.util.Scanner;

/**
 * 
 * @author Daniel
 *
 */
public class Ejercicio4 {

	/**
	 * 
	 * @return <b> M�todo <b> que devuelve la suma de los 5 n�meros introducidos
	 *         y que en caso de meter otra cosa que no sea n�mero te vuelve a
	 *         pedir los n�meros
	 * 
	 */
	public int sumaEnteros() {
		int suma = 0;
		boolean pregunta;
		Scanner sc = new Scanner(System.in);
		do {
			pregunta = false;
			try {
				System.out.println("Introduzca primer n�mero");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca segundo n�mero");
				int num2 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca tercer n�mero");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca cuarto n�mero");
				int num4 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca quinto n�mero");
				int num5 = Integer.parseInt(sc.nextLine());

				suma = (num1 + num2 + num3 + num4 + num5);
			} catch (NumberFormatException error1) {
				System.out.println("Hay que introducir n�meros");
				pregunta = true;
			}

		} while (pregunta);

		return suma;
	}

	/**
	 * 
	 * @param args
	 *            <b>M�todo<b> main que sirve para instancia un objeto de la
	 *            clase y llamar al m�todo sumaEnteros.
	 */
	public static void main(String[] args) {
		Ejercicio4 mio = new Ejercicio4();

		System.out.println("La suma de los n�meros es de : "
				+ mio.sumaEnteros());
	}
}
