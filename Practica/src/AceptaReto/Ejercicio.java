package AceptaReto;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean casa = false;

		while (casa == false) {
			int num = sc.nextInt();

			if (num == 0 || num > 1000) {
				if (casa = true) {
					break;
				}
				

			}

			if (num % 2 == 0) {
				System.out.println("DERECHA");
			}

			else {
				System.out.println("IZQUIERDA");
			}

		}
	}
}
