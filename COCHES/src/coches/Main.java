package coches;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menuPrincipal;
		int nCoches = 1;
		
		
		
		Scanner leer = new Scanner(System.in);
		Scanner ver = new Scanner(System.in);
	
		
		Carrera pista = new Carrera("Senda de Arena", "00", 2400, 8, "Carretera que atraviesa parte del desierto del Sahara");
		
		Coche vCoches[] = new Coche[pista.getCompMax()];
		
		vCoches[0] = new Coche("Wolf O'Donnell", 13, pista.getLongitud(), true);
		
		do { // Bucle principal del Juego
		
			Menu.mostrarMenu();
			menuPrincipal = ver.nextInt();
			
			switch(menuPrincipal){
			case 1:
				
				Menu.pintarPista();
				
				Menu.menuOpciones();
				
				
				
				
				
				
				break;
			case 2:
				nCoches = nCoches + 1;
				if (nCoches > pista.getCompMax()){
					System.out.println("Numero de competidores maximo alcanzado");
				}else{
					Carrera.addCoche();
					System.out.println("Piloto registrado correctamente");
				}
				
				break;
			case 0: 
				System.out.println("Nos vemos jugador...");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			
		}while (menuPrincipal != 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Tras arrancar te daran la opcion de Acelerar, frenar.
		
		// Si tu coche se acidenta debe mostrarte la opcion de rearrancar en pantalla a menos que el accidente fuese grave que entonces te dara la opcion de <abandonar> o de <espectar carrera> opcion en la que se apuesta a un coche que se crea va a ganar. 
		
		
		//Ademas antes de terminar tu turno debe una funcion debe de ver por si se cumplen escenarios especiales en los cuales te dara unas opciones de curso de accion.
		
		// Si tu velocidad supera el limite impuesto tendras una funcion <ComprobarAcidentado> que comprobara tu distancia.
		
		
		// Finalmente, si cruzas la meta te mostrara en pantalla tu posicion. Si dos o mas competidores pasan la meta el mismo turno, asignara el ganador en funcion de: (DistanciaTotal - Recorrida)/velocidad    *El resultado menor llega antes.
		
		
		
		
	}

}
