package Objetos;


public class CarroTest {

	public static void main(String[] args) {
		Carro c;
		c = new Carro();
		c.cilindrada = 1800;
		c.color = "plata";
		c.precio = 25000.0;
		System.out.println("¿Qué coche es este?");
		c.verCoche();
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
		System.out.println("¿Qué coche es este?");
		c.verCoche();
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();

	}

}
