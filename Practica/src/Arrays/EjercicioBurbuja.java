package Arrays;

import java.util.Scanner;

public class EjercicioBurbuja {
	public static void main(String[] args) {
		/*
		 * Ordena un vector de 5 enteros que se piden por teclado utilizando el
		 * tipo de datos Array y el algoritmo de la burbuja visto en clase. El
		 * programa debe mostrar por pantalla los elementos ordenados de forma
		 * ascendente.
		 */
        
		Scanner sc = new Scanner(System.in);
		int[] vector = new int[5]; // Declaración del vector de 5 indices
		int aux; // Declaración de la variable aux que nos ayudara con el
					// intercambio de números

		for (int i = 0; i < vector.length; i++) { // Bucle que recorre el array
													// y le va asignando valores
													// a cada indice
			System.out.println("Introduzca el vector " + (i + 1) + " :");
			vector[i] = sc.nextInt();
			System.out.println("El vector " + (i + 1) + " es : " + vector[i]);
		}

		for (int k = 0; k < 4; k++) { // Primer bucle que hace 4 pasadas
			for (int f = 0; f < 4; f++) {
				if (vector[f] > vector[f + 1]) { // En está condición se hace el
													// intercambio de números
													// con la ayuda de la
													// variable aux
					aux = vector[f];
					vector[f] = vector[f + 1];
					vector[f + 1] = aux;

				}

			}
		}
		for (int i = 0; i < vector.length; i++) { // Último bucle for que una
													// vez hecho el intercamio
													// muestra todos los números
													// ordenados de mayor a
													// menor
			System.out.println("El elemento " + (i + 1) + " ordenado es : "
					+ vector[i]);
		}
	}
}
