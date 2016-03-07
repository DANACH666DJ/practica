package Objetos;

public class pajaro {
	private String color;
	private int edad;

	public void setEdad(int e) {
		this.edad = e;
	}

	public void printEdad() {
		System.out.println("La edad del pájaro es :" + edad);
	}

	public void setcolor(String c) {
		this.color = c;
	}

	public void printcolor() {
		System.out.println("El color del pájaro es :" + color);
	}

}
