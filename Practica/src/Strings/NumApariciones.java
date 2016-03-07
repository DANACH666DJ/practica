package Strings;

import java.util.Scanner;

public class NumApariciones {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que reciba como datos una cadena de caracteres y
		 * un carácter y reporte el número de veces que se encuentra el carácter
		 * en la cadena.
		 */

		// Inicio

		Scanner sc = new Scanner(System.in);
		int veces = 0;

		System.out.println("Introduzca una cadena de caracteres : ");
		String cadena = sc.nextLine();
		

		System.out.println("Introduzca un caracter : ");
		char caract = sc.next().charAt(0);

		//Proceso
		for (int i = 0; i < cadena.length(); i++) {
			if (caract == cadena.charAt(i)) {
				veces++;
			}

		}
		
	   //Resultado
		System.out
				.println("El número de veces que se ha repetido el caracter es de : "
						+ veces);

	}

}
