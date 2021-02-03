package coches;

import java.util.Random;

public class Coche {

	private String nombrePilot;
	
	private int dorsal;
	
	private int distancia;
	
	private String estado; //Parado, Marcha, Accidentado, Terminado.
	
	private final int POTENCIA = 50;
	
	private int velocidad; // Km/h
	
	private int kmRecorridos;
	
	private boolean humano;
	
//	private int numCComp; // numero de coches compitiendo.
	
//	private int numCCarr; // Numero de coches en estado Marcha.
	
//	private int numCTerm; // Numero de coches en estado Terminado.
	
//	private boolean carreraTerminada; // Cuando todos los coches estan en estado Terminado o Accidentado.

	
	public Coche(String nombrePilot, int dorsal, int distancia, boolean humano) {
		this.nombrePilot = nombrePilot;
		this.dorsal = dorsal;
		this.distancia = distancia;
		this.estado = "parado";
		this.velocidad = 0;
		this.kmRecorridos = 0;
		this.humano = humano;
	}
	
	//
	// Fin Constructor
	
	
	// getter y Setters
	//
	//
	
	public String getNombrePilot() {
		return nombrePilot;
	}
	public void setNombrePilot(String nombrePilot) {
		this.nombrePilot = nombrePilot;
	}

	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = "Parado";
	}

	public int getPotencia() {
		return POTENCIA;
	}
	

	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = 0;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}
	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = 0;
	}


	
	// Fin Getter y Setters
	//
	// Constructor
	

	
	// toString
	@Override
	public String toString() {
		return "Coche [nombre del Piloto=" + nombrePilot + ", su dorsal es el=" + dorsal
				+ " su estado es=" + estado
				+ ", y con una potencia de=" + POTENCIA + "]";
	}
	
	
	//
	// Fin toString
	
	
	// Metodo Acelerar
	
	public void acelerar(){
		
		Random azar = new Random();
		int acelerado = azar.nextInt(POTENCIA + 1);
		
		velocidad += acelerado;
		
		if (velocidad > 200){
			estado = "Accidentado";
			velocidad = 0;
		}else {
			kmRecorridos += velocidad;
		}
	}
	
	//Metodo Arrancar
	
	public void arrancar(){
		
		if (this.estado.equalsIgnoreCase("parado")) {
			estado = "Marcha";
		}else {
			System.out.println("No puedes arrancar el coche en el estado que estas.");
		}
	}
	
	// Metodo Frenar
	
	public void frenar(){
		
		Random azar = new Random();
		int frenado = azar.nextInt(POTENCIA + 1);
		
		velocidad = velocidad - frenado;
		if (velocidad <= 0) {
			velocidad = 0;
		}
		kmRecorridos += velocidad;
	}
	
	// Metodo Rearrancar
	
	
	public void rearrancar(){
		
		Random azar = new Random();
		int r = azar.nextInt(3);
		
		if (r == 2) {
			estado = "Marcha";
		} else {
			System.out.println("No has conseguido arrancar el coche, sigues accidentado");
		}
	}
	
	

	
		
	
	
	
	
	
	
	
}
