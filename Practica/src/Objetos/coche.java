package Objetos;

public class coche {
	private int velocidad;

	coche() {
		velocidad = 0;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void acelera(int mas) {
		velocidad += mas;
	}

	public void frena(int menos) {
		velocidad -= menos;
	}

	public static void main(String[] args) {
		coche c = new coche();
		System.out.println("La velocidad inicial es :" + c.getVelocidad());
		c.acelera(200);
		System.out.println("La velocidad al acelerar es :" + c.getVelocidad());
		c.frena(50);
		System.out.println("La velocidad al frenar es :" + c.getVelocidad());
	}
}
