package Strings;

import java.util.Scanner;

public class StringPalindromo {
	public static void main(String[] args) {
		/* Implementa un programa que indique si una palabra es un pal�ndromo . */

		// Inicio
		Scanner sc = new Scanner(System.in);

		String palabra = "";

		palabra = sc.nextLine();

		StringBuilder aux = new StringBuilder(palabra);

		if (aux.reverse().toString().equals(palabra)) {
			System.out.println("Pal�ndromo");
		} else {
			System.out.println("No  pal�ndromo");
		}

	}
}
