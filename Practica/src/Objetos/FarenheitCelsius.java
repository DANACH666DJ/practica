package Objetos;

import java.util.Scanner;



public class FarenheitCelsius {
	public double gradosFarenheit(double grados) {
		double farenheit = 32 + (9 * grados / 5);
		return farenheit;
	}

	public double gradosFarenheitCelsius() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce grados farenheit");
		double farenheit = sc.nextDouble();
		double celsius = 5 * (farenheit - 32) / 9;
		return celsius;
	}

	public double gradosCelsiusFarenheit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce grados celsius");
		double celsius = sc.nextDouble();
		double farenheit = (9 * celsius) / 5 + 32;
		return farenheit;
	}

	public static void main(String[] args) {

		FarenheitCelsius mio = new FarenheitCelsius ();
		System.out.println("Los grados celsius a Farenheit son : "
				+ mio.gradosCelsiusFarenheit());
		System.out.println("Los grados farenheit a celsius son : "
				+ mio.gradosFarenheitCelsius());

	}

}
