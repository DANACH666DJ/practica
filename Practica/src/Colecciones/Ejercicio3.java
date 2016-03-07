package Colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		 InputStreamReader is=new InputStreamReader(System.in);   
		 BufferedReader br=new BufferedReader(is);  
		 String newstr=""; 
		 char ch=' '; 
		 
		 System.out.println("Enter the Word:"); 
		 String str=br.readLine(); 
		 
		    ///{write your code here  
		
		 LinkedList <Character>lista=new LinkedList<Character>();
		 for (int i = 0; i < str.length(); i++) {
			lista.add(str.charAt(i));
			
		}
		
		
		Iterator<Character> lista1=lista.iterator();
		
		while(lista1.hasNext()){
			ch=lista1.next();
			if(ch=='a' ||ch=='e'||ch=='i' || ch=='o'||ch=='u'){
				lista1.remove();	
		}else{
			newstr+=ch;
		}
			
		} 
			   
		
		    ///}  
		 
		  System.out.println("Edited Word:"+newstr);  

	}
}
