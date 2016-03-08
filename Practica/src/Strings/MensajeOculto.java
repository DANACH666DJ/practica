package Strings;

import java.util.Scanner;

public class MensajeOculto {

	public static void main(String[] args) {
		/*Túker Chiménez ve cosas escondidas en cualquier lado. Una mancha de humedad
		en la pared se le antoja la cara de la anterior propietaria de una casa; el sonido del
		viento le parece un susurro venido del más allá; una nube con forma peculiar le
		convence de la existencia de vida extraterrestre.
		Ahora le ha dado por ver mensajes ocultos en cualquier sitio. Por poner un
		ejemplo, si lee el siguiente titular: "El presidente del Gobierno se somete esta noche
		al escrutinio de varios periodistas en Televisión Española.", se las ingenia para leer
		un "te odio" oculto que le mantiene en vela toda la noche:
		El presidenTe dEl Gobierno se sOmete esta noche al escrutinio De varIos periOdistas
		en Televisión Española.
		Ahora quiere automatizar la tarea de la búsqueda de estos mensajes.*/
		
		//Inicio
		Scanner lectura=new Scanner(System.in);
		boolean respuesta;
		System.out.println("Introduzca los casos de prueba :");
		int exito,k,casos=Integer.parseInt(lectura.nextLine());
		String texto,mensaje;
		exito=0;
		//Proceso
		respuesta=true;
		for (int i = 0; i < casos; i++) {
			System.out.println("Introduzca el caso "+(i+1));
			System.out.println("Introduzca el texto");
			texto=lectura.nextLine().toLowerCase();
			System.out.println("Introduzca el mensaje oculto");
			mensaje=lectura.nextLine().toLowerCase();
			k=0;
			//Tratar el caso
			for (int j = 0; j < mensaje.length(); j++) {
				while(mensaje.charAt(j)!=texto.charAt(k)&& k < texto.length()-1){
				     k++;
			}
				if(mensaje.charAt(j)==texto.charAt(k))
					exito++;
				k++;
		}
		//Presentación
        if(exito==mensaje.length())
        	System.out.println("El mensaje oculto aparece");
        else
        	System.out.println("El mensaje ocuto no aparece");
	}
	}

	}


