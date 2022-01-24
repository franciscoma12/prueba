import java.util.Scanner;

//Programa que calcula el número de la suerte de una persona a partir de su fecha de nacimiento.
public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int dia, mes, año, suerte, suma, n1, n2, n3, n4;                                          
        System.out.println("Introduzca fecha de nacimiento");
        System.out.print("día: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        año = sc.nextInt();
        suma = dia + mes + año;
        n1 = suma/1000;      
        n2 = suma/100%10;    
        n3 = suma/10%10;     
        n4 = suma%10;        
        suerte = n1+n2+n3+n4;
        System.out.println("Su número de la suerte es: " + suerte);    
	}
}
