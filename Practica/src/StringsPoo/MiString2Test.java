package StringsPoo;

import java.util.Scanner;


public class MiString2Test {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		MiString2 mio=new MiString2();
		System.out.println("Ingrese un caracter :");
		char a = scan.next().charAt(0);
		System.out.println("El número de ocurrencias de "+a+" es : "+mio.contarCaracter(a));

	}

}
