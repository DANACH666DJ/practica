package Colecciones;

import java.util.HashMap;
import java.util.Map.Entry;

public class BucleForEach {

	public static void main(String[] args) {

HashMap <Integer,Integer> points= new HashMap <Integer,Integer> ();
		
		points.put(1111,100);
		points.put(2222,150);
		points.put(3333,200);
		points.put(4444,500);
//		System.out.println(points.get(1111));
		for (Integer i : points.keySet()) {
			points.put(i, points.get(i)+10);
			
		}
	    for(Entry <Integer,Integer> j:points.entrySet())
	    	System.out.println(j);
	    	
			
		
		
		
		

	}
}
