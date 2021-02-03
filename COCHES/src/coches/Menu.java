package coches;

public class Menu {

	static Carrera pista = new Carrera("Senda de Arena", "00", 2400, 8, "Carretera que atraviesa parte del desierto del Sahara");

	
	public static void mostrarMenu(){
		
		System.out.println("*******************_______________*********************");
		System.out.println("******************|1.  P.L.A.Y    |********************");
		System.out.println("******************|_______________|********************");
		System.out.println("*******************_______________*********************");
		System.out.println("******************|2. C.R.E.A.R   |********************");
		System.out.println("******************|___Corredor____|********************");
		System.out.println("*******************_______________*********************");
		System.out.println("******************|0. S.A.L.I.R   |********************");
		System.out.println("******************|_______________|********************");
		System.out.println("******************                 ********************");
	}
	
	
	public static void pintarPista(){
		
		for (int i = 0; i < pista.getLongitud(); i++){
			
			System.out.print("_");
		}
		System.out.println("");
		for (int i = 0; i < 20; i++){
			
			System.out.print("||||| Velocidad actual: " + (vCoches[0].getVelocidad()) + "  k/h  ||||||||||||||||||||||||||||||||||||||||||||||");
		}
		System.out.println("");
		for (int i = 0; i < pista.getLongitud(); i++){
			
			System.out.print("_");
		}
		System.out.println("");
		
		for (int i = 0; i <= vCoches[0].KmRecorridos; i++){
			
			System.out.print("=");
			
		}
		System.out.println("D");
		for (int i = 0; i < pista.getLongitud(); i++){
			
			System.out.print("_");
		}
		System.out.println("");
		
	}
	
	public static void menuOpciones(){
		
		
		
	}
	
	
	
	
	
	
}
