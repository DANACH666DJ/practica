package Arrays;

import java.util.Scanner;

public class BuscarVector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vector = { 4, 6, 8, 9, 13 }; // Declarar vector de 5 posiciones

		System.out.println("Introduzca un número : "); // Introducir un número
														// por pantalla
		int num = sc.nextInt();
		boolean pregunta = false;

		for (int i = 0; i < vector.length; i++) { // Recorrer el array con un
													// bucle for para comprobar
													// todos los indices

			if (vector[i] == num) { // Condición para comprobar si alguno de los
									// índices es igual al número introducido
				pregunta = true; // Aquí si el número esta dentro del vector el
									// boolean lo ponemos a true
			}

		}
		if (pregunta) // Y por último comprobamos con otra condición si el
						// número está en el vector

			System.out.println("El número está en el vector");
		else
			System.out.println("El número no está en el vector");

	}

}
