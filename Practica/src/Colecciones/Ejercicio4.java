package Colecciones;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio4 {
	public static void main(String[] args) {
		 int a, b, c;

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter three numbers:");
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = sc.nextInt();

	       /* 
	          
	       */
	        TreeSet <Integer>lista = new TreeSet<Integer>(); 
	        lista.add(a);
	        lista.add(b);
	        lista.add(c);
	        
	        
	     
	      
	      System.out.println(lista);
	      
	        
	        
	        // print stats
	        System.out.println("Sorted numbers:");

	}
	
}
