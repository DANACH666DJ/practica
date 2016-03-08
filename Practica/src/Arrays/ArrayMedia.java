package Arrays;

import java.util.Scanner;

public class ArrayMedia {
	public static void main(String[] args) {
		/*
		 * Nota media Ejercicio 1 – 2 puntos Tal y como se decía en la
		 * introducción de esta UF, si necesitas crear un programa para calcular
		 * la nota media de la clase, lo ideal es utilizar los arrays como
		 * estructura de almacenamiento. Crea un programa que tenga un parámetro
		 * con el número de alumnos. Al comienzo del mismo se pedirán las notas
		 * de cada uno de los alumnos (mostrando el número del alumno (desde 1
		 * hasta N, siendo N el número total de alumnos). Al finalizar el
		 * programa, se mostrará la nota media de la clase.
		 */

		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		System.out.println("La cantidad de alumnos es : " + args[0]);

		int[] media = new int[Integer.parseInt(args[0])];     

		for (int i = 0; i < media.length; i++) {
			System.out.println("Introduzca num " + (i + 1));
			media[i] = sc.nextInt();
			resultado += media[i];         //Aqui se van sumando los indicces y se guardan en la variable resultado
			System.out.println("El elemento " + (i + 1) + " es : " + media[i]);

		}

		System.out.println();
		System.out.println("El total es " + resultado);
		System.out.println("La media es " + resultado / media.length);

	}
}
