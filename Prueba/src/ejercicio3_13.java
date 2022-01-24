//Algoritmo que pida dos números naturales e imprimir su cociente entero por el 
//método de las restas sucesivas
import java.util.Scanner;
public class ejercicio3_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int dividiendo, divisor, cociente, resto ;
		System.out.println("Inserte el dividendo ");
		dividiendo= sc.nextInt();
		System.out.println("Inserte el divisor ");
		divisor= sc.nextInt();
		
		if (dividiendo > 0 && divisor > 0)
			{
			cociente = 0;
			resto=dividiendo;
			while ( resto >= divisor )
	        {
	            resto -= divisor;
	            cociente++;
	        }
			System.out.printf( "%d div %d = %d ( Resto = %d )", dividiendo, divisor, cociente, resto );
			
		    }
		    else
		    	System.out.printf( "ERROR." );
					}
			}
	
