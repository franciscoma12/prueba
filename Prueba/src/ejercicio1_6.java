// Algoritmo que determine si un a�o dado es bisiesto o no, teniendo en cuenta que son 
//a�os bisiestos los m�ltiplos de 4, excepto los que son tambi�n m�ltiplos de 100 pero no 
//lo son de 400. 
import java.util.Scanner ;
public class ejercicio1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a�o ;
		System.out.print("Introduce el a�o");
		a�o=sc.nextInt();
		if (a�o % 4 != 0 )
			System.out.print("No es bisiesto");
		else if ((a�o% 4 == 0) &&  (a�o% 100 != 0))
			System.out.print("Es bisiesto");
		else if  (((a�o% 4 == 0) && (a�o % 100 == 0)) && (a�o % 400 != 0))
			System.out.print("No es bisiesto");
		else if (((a�o % 4 == 0) && (a�o % 100 == 0)) && (a�o % 400 == 0))
			System.out.print("Es bisiesto");
	}

}
