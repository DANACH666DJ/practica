package Objetos;

public class Cochee {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;

	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	public Cochee() {

		this.ruedas = 4;
		this.largo = 2000;
		this.ancho = 300;
		this.motor = 1600;
		this.peso_plataforma = 500;

	}

	public String dime_datosGenerales() { // Metodo getter devuelve dato con
											// return
		return "La plataforma del vehículo tiene " + ruedas + " ruedas "
				+ ".Mide " + largo / 1000 + " metros con un ancho de " + ancho
				+ " centímetros" + ",y un peso de plataforma de "
				+ peso_plataforma + " kg";
	}

	public void establece_color(String color_coche) { // Metodo setter modifica
														// el valor
		this.color = color_coche;
	}

	public String dime_color() {
		return "El coche es de color " + color;
	}

	public void establece_asientos(String asientos_cuero) {//Setter
		if (asientos_cuero == "si") {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos(){  //Getter
		if(asientos_cuero==true){
			return "El coche tiene asientos de cuero";
		}else{
			return"El coche tiene asientos de serie";
		}
	}
	

	
}
