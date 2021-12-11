import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	static ArrayList <Poligono>poligono = new ArrayList<Poligono>();
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Llenar un Poligono
		llenarPoligono();
		
		// 
		llenarResultados();
		
	}
	
	public static void llenarPoligono() {
		char Respuesta;
		int opcion;
		do {
			do {
				System.out.println("Digite que poligo desea:");
				System.out.println("1.- Triangulo");
				System.out.println("2.- Rectangulo");
				System.out.println("Opcion: ");
				opcion = in.nextInt();
				
			}while(opcion<1 || opcion>2);
			
			switch(opcion) {
			case 1: // Llenar un Triangulo
				llenarTriangulo();
				break;
				
			case 2:  // Llenar un Rectangulo
				llenarRectangulo();
				break;
			}
			
			System.out.println("\n Desea Introducir otro Poligono (s/n): ");
			Respuesta = in.next().charAt(0);
			System.out.println("");
			
		}while(Respuesta == 's' || Respuesta == 'S');	
		
	} // Fin del metodo llenarPoligono
	
	public static void llenarTriangulo() {
		double l1, l2, l3;
		
		System.out.println("Digite el Lado 1 del Triangulo: ");
		l1= in.nextDouble();
		System.out.println("Digite el Lado 2 del Triangulo: ");
		l2= in.nextDouble();
		System.out.println("Digite el Lado 3 del Triangulo: ");
		l3= in.nextDouble();
		
		Triangulo triangulo= new Triangulo(l1, l2, l3);
		
		//Guardamos un triangulo dentro de nuestoArreglo de poligonos
		poligono.add(triangulo);
		
	}// Fin del Metodo llenarTriangulo
	
	public static void llenarRectangulo() {
		double l1, l2;

		System.out.println("Digite el Lado 1 del Rectangulo: ");
		l1= in.nextDouble();
		System.out.println("Digite el Lado 2 del Rectangulo: ");
		l2= in.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(l1, l2);
		
		//Guardando un Rectangulo dentro de nuestro Arreglo Poligono
		poligono.add(rectangulo);
		
	}// Fin de Metodo llenarRectangulo
	
	
	public static void llenarResultados() {
		// Recorriendo el Arreglo de Pologono
		for(Poligono poli: poligono) {
			System.out.println(poli.toString());
			System.out.println("Area: =" + poli.area());
			System.out.println("");
		}
		
	}

}
