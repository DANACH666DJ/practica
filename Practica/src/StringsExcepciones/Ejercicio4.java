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
	 * @return <b> Método <b> que devuelve la suma de los 5 números introducidos
	 *         y que en caso de meter otra cosa que no sea número te vuelve a
	 *         pedir los números
	 * 
	 */
	public int sumaEnteros() {
		int suma = 0;
		boolean pregunta;
		Scanner sc = new Scanner(System.in);
		do {
			pregunta = false;
			try {
				System.out.println("Introduzca primer número");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca segundo número");
				int num2 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca tercer número");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca cuarto número");
				int num4 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca quinto número");
				int num5 = Integer.parseInt(sc.nextLine());

				suma = (num1 + num2 + num3 + num4 + num5);
			} catch (NumberFormatException error1) {
				System.out.println("Hay que introducir números");
				pregunta = true;
			}

		} while (pregunta);

		return suma;
	}

	/**
	 * 
	 * @param args
	 *            <b>Método<b> main que sirve para instancia un objeto de la
	 *            clase y llamar al método sumaEnteros.
	 */
	public static void main(String[] args) {
		Ejercicio4 mio = new Ejercicio4();

		System.out.println("La suma de los números es de : "
				+ mio.sumaEnteros());
	}
}
