package coches;

import java.util.Random;

import java.util.Scanner;

public class Carrera {
	
	private Coche vCoches[]; //Aqui guardamos todos los coches

	private String nombrePista;
	
	private String codPista;
	
	private int longitud; // De cuantos km es la carrera
	
	private int compMax;
	
	private String descripcion;
	
	public Carrera(String nombrePista, String codPista, int longitud,
			int compMax, String descripcion) {
		this.nombrePista = nombrePista;
		this.codPista = codPista;
		this.longitud = longitud;
		this.compMax = compMax;
		this.descripcion = descripcion;
		this.vCoches = new Coche[compMax];
	}
	

	public String getNombrePista() {
		return nombrePista;
	}
	public void setNombrePista(String nombrePista) {
		this.nombrePista = "";
	}
	
	
	public String getCodPista() {
		return codPista;
	}
	public void setCodPista(String codPista) {
		this.codPista = codPista;
	}
	
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = 0;
	}
	
	
	public int getCompMax() {
		return compMax;
	}
	public void setCompMax(int compMax) {
		this.compMax = 0;
	}
	

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = "";
	}


	
	
	@Override
	public String toString() {
		return "Carrera [La pista se llama=" + nombrePista + ", su codigo es=" + codPista
				+ ", su longitud es de=" + longitud + " km, y el numero maximo de competidores es=" + compMax
				+ "]";
	}
	

	Scanner leer = new Scanner(System.in);
	Scanner ver = new Scanner(System.in);
	
	
	
	public void addCoche() {
		String nombre, respuesta;
		boolean humano = false;
		boolean confirmo = false;
		int dorsal;
		
		System.out.println("Nombre del piloto");
		nombre = leer.next();
		
		/*do {*/
			
			System.out.println("Dorsal del piloto:");
			dorsal = ver.nextInt();
			
			/*for(Coche:vCoches[pista.getCompMax()]){
				
				if(dorsal == vCoches.getDorsal()){
					confirmo = false;
					System.out.println("No puede haber 2 dorsales iguales, (intente con otro numero)");
					break;
				}
				
			}	
			
		}while(confirmo != true);*/
		
		
		System.out.println("Sera IA? ('Si'o'No')");
		respuesta = leer.next();
		if (respuesta.equalsIgnoreCase("no")){
			humano = true;
		}
		
		Coche c = new Coche(nombre, dorsal, this.longitud, humano);
		//Buscar hueco en el vector  y guardarlo
	}
	
	
	
	
	
	
	
}
