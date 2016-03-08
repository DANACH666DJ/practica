package Arrays;

import java.util.Scanner;

public class BuscarVector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vector = { 4, 6, 8, 9, 13 }; // Declarar vector de 5 posiciones

		System.out.println("Introduzca un n�mero : "); // Introducir un n�mero
														// por pantalla
		int num = sc.nextInt();
		boolean pregunta = false;

		for (int i = 0; i < vector.length; i++) { // Recorrer el array con un
													// bucle for para comprobar
													// todos los indices

			if (vector[i] == num) { // Condici�n para comprobar si alguno de los
									// �ndices es igual al n�mero introducido
				pregunta = true; // Aqu� si el n�mero esta dentro del vector el
									// boolean lo ponemos a true
			}

		}
		if (pregunta) // Y por �ltimo comprobamos con otra condici�n si el
						// n�mero est� en el vector

			System.out.println("El n�mero est� en el vector");
		else
			System.out.println("El n�mero no est� en el vector");

	}

}
