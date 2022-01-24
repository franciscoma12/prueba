//Programa que calcule el cambio que se debe devolver al usuario. Se pedirán por 
//teclado dos número, el precio del artículo y el importe introducido
import java.util.Scanner;
public class ejercicio10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float precio, importe, cambio;
		int euros, centimos, m2, m1, m50c, m20c, m10c, m5c, m2c, m1c;
		
		System.out.println("Introduce precio");
		precio = entrada.nextFloat();
		System.out.println("Importe introducido");
		importe = entrada.nextFloat();
		
		cambio = importe - precio;
		euros= (int) cambio;
		centimos = (int) (cambio - euros)*100;
		m2 = euros / 2;
		m1 = euros % 2;
		
		m50c = centimos /50;
		centimos = centimos % 50;
		
		m20c = centimos /20;
		centimos %=20;
		
		m10c = centimos /10;
		centimos %=10;
		
		m5c = centimos /5;
		centimos %=5;
		
		m2c = centimos /2;
		m1c = centimos %10;
		
		System.out.printf("el cambio son %d monedas de 2 €, %d monedas de 1€, %d monedas de 50cent, %d monedas de 20cent, %d monedas de 10cent,"
				+ "%d monedas de 5cent, %d monedas de 2cent, %d monedas de 1 cent",
		m2, m1, m50c,m20c,m10c,m5c,m2c,m1c );

	}

}
