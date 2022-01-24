import java.util.Scanner;

//factorial de un numero introducido por el usuario
public class Ejerciciofactorail {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		long factorial= 1;
		System.out.println ("Introduce el número para calcular su factorial: ");
		num=sc.nextInt();
		for (int i=2; i<=num; i++) {
			factorial= factorial*i;
		}
		
		System.out.println("El factorial de " +num+ " es " +factorial);
	}

}
