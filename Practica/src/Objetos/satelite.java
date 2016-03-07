package Objetos;

public class satelite {
	private double meridiano;
	private double paralelo; // Le falta el ; para cerrar la variable;
	private double distancia_tierra;

	satelite(double m, double p, double d) {
		this.meridiano = m;
		this.paralelo = p;
		this.distancia_tierra = d;
	}

	satelite() { // La tilde de la é debería ir sin tilde como la de la clase
					// satelite .
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		this.meridiano = m;
		this.paralelo = p;
		this.distancia_tierra = d; // Le falta la doble r de tierra.
	}

	public void printPosicion() {
		System.out.println("El satélite se encuentra en el paralelo" + paralelo
				+ "Meridiano " + meridiano + "a una distancia de la tierra de "
				+ distancia_tierra + "Kilómetros"); /*
													 * Le faltan las dobles
													 * comillas a cada String
													 * del System.out.println y
													 * quitarselas y
													 * cambiarselas de un
													 * meridiano a otro puesto
													 * que meridiano con
													 * minúscula es una variable
													 */
	}

}
