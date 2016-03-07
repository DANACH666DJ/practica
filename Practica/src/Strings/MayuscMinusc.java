package Strings;

import java.util.Scanner;
/**
 * 
 * @author Daniel
 *
 */
public class MayuscMinusc {
	/*Hacer un programa que solicite una cadena de caracteres por teclado y determine
	el n�mero de may�sculas y el n�mero de min�sculas.*/
	
	// Inicio
	// Proceso
	public static int NumeroMay�sculas(String s) {
		int contador = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) // Comprobaci�n con una condicion si el rango del array tiene
				                                        //mayusculas utilizando los valores de la tabla ascii
				
				contador++; // Si hay aqui va incrementado el contador
		}
		return contador;
	}
	public static int NumeroMin�sculas(String c) {
		int contador1 = 0;
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
				contador1++;
		}
		return contador1;
	}
	public static void main(String[] args) {
		/*
		 * Hacer un programa que solicite una cadena de caracteres por teclado y
		 * determine el n�mero de may�sculas y el n�mero de min�sculas.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres : ");
		String cadena = sc.nextLine();
		// Resultado
		System.out.println("El n�mero de may�sculas de el String es de : " // Aqu� se utiliza el metodo de arriba para
				                                                           // ver el numero de mayusculas
																
				+ NumeroMay�sculas(cadena));
		System.out.println("El n�mero de min�sculas de el String es de : "
				+ NumeroMin�sculas(cadena));
	}
	
}
