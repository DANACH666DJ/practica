package StringsExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HolaMundo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean hayQueRepetir;
		do {
			hayQueRepetir = false;
			try {
				System.out.print("Introduzca un número :");
				int num = Integer.parseInt(sc.nextLine());
				System.out.print("Introduzca otro número :");
				int num1 = Integer.parseInt(sc.nextLine());

				System.out
						.println("La suma de los dos números introducidos es de : "
								+ (num / num1));

			} catch (ArithmeticException patata) {
				System.out.println("No se puede dividir entre cero");
				hayQueRepetir = true;

			} catch (InputMismatchException patata) {
				System.out.println("Hay que introducir números");
				hayQueRepetir = true;
			} catch (Exception e) {
				System.out.println("error");
				hayQueRepetir = true;
			} finally {
				System.out.println("Final");
			}

		} while (hayQueRepetir);
		sc.close();

	}
}
