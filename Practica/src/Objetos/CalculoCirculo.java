package Objetos;

import java.util.Scanner;



public class CalculoCirculo {
	/**
	 * 
	 * @return
	 */
	public double LongCircun() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio");
		double radio = sc.nextDouble();

		double LongCircun = 2 * Math.PI* radio;

		return LongCircun;

	}
/**
 * 
 * @return
 */
	public double AreaCircun() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio");
		double radio = sc.nextDouble();

		double AreaCircun = Math.PI* Math.pow(radio, 2);

		return AreaCircun;

	}
/**
 * 
 * @param args
 */
	public static void main(String[] args) {

		CalculoCirculo mio = new CalculoCirculo();

		System.out.println("La longitud de la circunferencia es "
				+ mio.LongCircun());
		System.out.println("El area de la circunferencia es "
				+ mio.AreaCircun());

	}
}
