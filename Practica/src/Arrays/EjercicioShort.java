package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioShort {
	public static void main(String[] args) {
		// Ordenación descendente (sort)

		/*
		 * El envoltorio Arrays posee muchas herramientas interesantes para
		 * vectores, entre las que se incluye la ordenación (sort) y la
		 * impresión (toString) de vectores. Crea un programa que solicite al
		 * usuario el número de elementos a ordenar, solicite su introducción
		 * por pantalla y finalmente los muestre por pantalla ordenados de forma
		 * descendente. Debes utilizar un array para almacenar la información y
		 * los métodos comentados para ordenar e imprimir el resultado.
		 */
		Scanner sc = new Scanner(System.in);

		Integer[] arreglo = new Integer[5];
		System.out.println("El número de elementos a ordenar es de : "
				+arreglo.length);
		

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Introduzca el indice " + (i + 1) + " :");
			arreglo[i] = sc.nextInt();
			System.out.println("El indice " + (i + 1) + " es : " + arreglo[i]);

		}
		System.out.println("Los elementos a ordenar han sido : "+arreglo.length);
		Arrays.sort(arreglo, Collections.reverseOrder());
		// for (int i = 0; i < arreglo.length; i++) {
		// System.out.println(arreglo[i]);
		System.out
				.println("Los elementos ordenados  de manera descendente quedarían así : "
						+ Arrays.toString(arreglo));
	}

}
