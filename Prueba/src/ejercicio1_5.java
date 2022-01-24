//Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
//correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, 
//paralelas o secantes. En el caso de que sean secantes, hay que indicar si son 
//perpendiculares o no
import java.util.Scanner;
public class ejercicio1_5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a1, b1, c1, a2, b2, c2;
		
		System.out.println("Introduce la primera recta: ");
		System.out.print("A: ");
		a1= entrada.nextDouble();
		System.out.print(" B: ");
		b1= entrada.nextDouble();
		System.out.print(" C: ");
		c1= entrada.nextDouble();
		
		System.out.println("Introduce la segunda recta: ");
		System.out.print("A: ");
		a2= entrada.nextDouble();
		System.out.print(" B: ");
		b2= entrada.nextDouble();
		System.out.print(" C: ");
		c2= entrada.nextDouble();
		
		if (a1/a2 != b1/b2) {
			System.out.print("Son rectas secantes");
			if (a1/b1 == -b2/a2) {
				System.out.println(" y son perpendiculares");
			}
		} else {
			System.out.print("Son paralelas");
			if (a1/a2 == c1/c2) {
				System.out.println(" y además son coincidentes");
			}
		}
		
	}
}
