package coches;

import java.util.Scanner;

public class Menu {

	//static Carrera pista = new Carrera("Senda de Arena", "00", 2400, 8, "Carretera que atraviesa parte del desierto del Sahara");

	
	
	
	public static int mostrarMenu(){
		
		Scanner ver = new Scanner(System.in);
		int n;
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
		n = ver.nextInt();
		
		
		
		return n;
	}
	
	
	
	
	public static int menuOpciones(){
		
		Scanner ver = new Scanner(System.in);
		int n;
		System.out.println("*******************_______________*********************");
		System.out.println("******************|1.  ARRANCAR   |********************");
		System.out.println("******************|_______________|********************");
		System.out.println("*******************_______________*********************");
		System.out.println("******************|2.  ACELERAR   |********************");
		System.out.println("******************|_______________|********************");
		System.out.println("*******************_______________*********************");
		System.out.println("******************|3.   FRENAR    |********************");
		System.out.println("******************|_______________|********************");
		System.out.println("******************* ______________*********************");
		System.out.println("******************|4. REARRANCAR  |********************");
		System.out.println("******************|_______________|********************");
		System.out.println("*******************_______________*********************");
		System.out.println("******************|5.  MANTENER   |********************");
		System.out.println("******************|_______________|********************");
		System.out.println("*******************               *********************");
		n = ver.nextInt();
		
		return n;
	}
	
	
	
	
	
	
}
