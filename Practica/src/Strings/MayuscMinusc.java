package Strings;

import java.util.Scanner;
/**
 * 
 * @author Daniel
 *
 */
public class MayuscMinusc {
	/*Hacer un programa que solicite una cadena de caracteres por teclado y determine
	el número de mayúsculas y el número de minúsculas.*/
	
	// Inicio
	// Proceso
	public static int NumeroMayúsculas(String s) {
		int contador = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) // Comprobación con una condicion si el rango del array tiene
				                                        //mayusculas utilizando los valores de la tabla ascii
				
				contador++; // Si hay aqui va incrementado el contador
		}
		return contador;
	}
	public static int NumeroMinúsculas(String c) {
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
		 * determine el número de mayúsculas y el número de minúsculas.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres : ");
		String cadena = sc.nextLine();
		// Resultado
		System.out.println("El número de mayúsculas de el String es de : " // Aquí se utiliza el metodo de arriba para
				                                                           // ver el numero de mayusculas
																
				+ NumeroMayúsculas(cadena));
		System.out.println("El número de minúsculas de el String es de : "
				+ NumeroMinúsculas(cadena));
	}
	
}
