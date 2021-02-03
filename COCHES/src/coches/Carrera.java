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
	
	boolean CarreraTerminada = false;
	
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
		boolean confirmo = true;
		int dorsal;
		
		System.out.println("Nombre del piloto");
		nombre = leer.next();
		
		do {
			
			System.out.println("Dorsal del piloto:");
			dorsal = ver.nextInt();
			
			for(Coche c :vCoches){
				
				if(c!=null && dorsal == c.getDorsal()){
					confirmo = false;
					System.out.println("No puede haber 2 dorsales iguales, (intente con otro numero)");
					break;
				}
				
			}	
			
		}while(confirmo != true);
		
		
		System.out.println("Sera IA? ('Si'o'No')");
		respuesta = leer.next();
		if (respuesta.equalsIgnoreCase("no")){
			humano = true;
		}
		
		
		//Buscar hueco en el vector  y guardarlo
		for (int i = 0; i <= compMax; i++) {
			if (vCoches[i] == null) {
				
				vCoches[i] = new Coche(nombre, dorsal, this.longitud, humano);
			}
		}
		
		
		
		
	}
	
	public void datosCoche(){
			
			for (int i = 0; i < vCoches.length; i++){
				
				if (vCoches[i] != null) {
					
					System.out.print("_");
					System.out.print((vCoches[i].toString()));
					System.out.print("_");
				}
			}
			System.out.println("");
		}
		
		
	public void jugarCarrera() {
	 
	 	boolean carreraTerminada = false;
		int accion;
		
		
		do {
			for (int i = 0; i < vCoches.length; i++) {
				if (vCoches[i] != null) {
					
					Coche c = vCoches[i];
					if (c.isHumano() == true) {
						accion = Menu.menuOpciones();
						switch(accion) {
						case 1:
							c.arrancar();
							break;
						case 2:
							c.acelerar();
							break;
						case 3:
							c.frenar();
							break;
						case 4:
							c.rearrancar();
							break;
						case 5:
							c.mantenerMarcha();
							break;
						default:
							break;
						}
					}else{
						switch (c.getEstado()) {
						case "Parado":
							c.arrancar();
							break;
						case "Accidentado":
							c.rearrancar();
							break;
						case "Marcha":
							
							if (c.getVelocidad() <= 150) {
								
								c.acelerar();
							} else {
								
								if (c.getVelocidad() >= 185) {
									
									Random azar = new Random();
									int r = azar.nextInt(2);
									if (r == 0) {
										c.frenar();
									} else {
										c.mantenerMarcha();
									}
								} else {
									Random azar = new Random();
									int r = azar.nextInt(2);
									if (r == 0) {
										c.acelerar();
									} else {
										c.mantenerMarcha();
									}
								}
							}
							break;

						default:
							break;
						}
					}
					
					
				}
			}
		
		
		
		carreraTerminada = comprobarFin();
		} while (carreraTerminada != true);
		
		
	
		
	}
	
	
	public boolean comprobarFin() {
		boolean fin = true;
		
		for (Coche c :vCoches) {
			
			if (c.getEstado().equalsIgnoreCase("Terminado")) {
				
				fin = false;
				return fin;
			}
		}
		return fin;
	}

	
}
