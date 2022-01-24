// Algoritmo que determine si un año dado es bisiesto o no, teniendo en cuenta que son 
//años bisiestos los múltiplos de 4, excepto los que son también múltiplos de 100 pero no 
//lo son de 400. 
import java.util.Scanner ;
public class ejercicio1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int año ;
		System.out.print("Introduce el año");
		año=sc.nextInt();
		if (año % 4 != 0 )
			System.out.print("No es bisiesto");
		else if ((año% 4 == 0) &&  (año% 100 != 0))
			System.out.print("Es bisiesto");
		else if  (((año% 4 == 0) && (año % 100 == 0)) && (año % 400 != 0))
			System.out.print("No es bisiesto");
		else if (((año % 4 == 0) && (año % 100 == 0)) && (año % 400 == 0))
			System.out.print("Es bisiesto");
	}

}
