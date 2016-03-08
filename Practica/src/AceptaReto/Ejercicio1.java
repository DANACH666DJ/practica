package AceptaReto;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int cantP=sc.nextInt();
		
		for (int i = 0; i < cantP; i++) {
			String palabra=sc.next();
			if(palabra.contains("a")&& palabra.contains("e")&& palabra.contains("i") &&palabra.contains("o")&&palabra.contains("u")){
			System.out.println("SI");
		}else{
			System.out.println("NO");
		}
	   



	}

}
}
