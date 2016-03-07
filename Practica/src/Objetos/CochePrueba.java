package Objetos;



public class CochePrueba {

	public static void main(String[] args) {
		Cochee Renault = new Cochee();

		System.out.println(Renault.dime_datosGenerales());
		Renault.establece_color("rojo");

		System.out.println(Renault.dime_color());
		
	   Renault.establece_asientos("si");
	   
	   System.out.println(Renault.dime_asientos());

	}

}
