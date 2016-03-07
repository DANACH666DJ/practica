package Strings;

import java.util.Scanner;

public class NumIntentos {
	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 100);

		Scanner scan = new Scanner(System.in);

		int num = 0;
		int intentos = 0;

		do {
			intentos++;
			System.out.println("Introduce un n�mero : ");
			num = scan.nextInt();

			if (aleatorio < num) {
				System.out.println("M�s bajo");
			} else if (aleatorio > num) {
				System.out.println("M�s alto");
			}

		} while (num != aleatorio);
		System.out.println("Correcto");
		System.out.println("El n�mero de intentos es de : " + intentos);

	}
}
