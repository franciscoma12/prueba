import java.util.Scanner;

//Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores de un 
//espacio N-dimensional, decir si son paralelos o no. Son paralelos si todos sus valores 
//son proporcionales
public class ej7 {
	public static void  main(String[] args) {
		Scanner entrada= new Scanner (System.in);
	
		System.out.println("¿Cuántos elementos quieres?: ");
		int tam1 = entrada.nextInt();
		
		int vector1 [] = new int[tam1];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector1);
		
		System.out.println("¿Cuántos elementos quieres?: ");
		int tam2 = entrada.nextInt();
		
		int vector2 [] = new int[tam2];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector2);
		
		boolean paralelos=true;
		float factor =vector1[0]/vector2[0];
		for (int i=0; i<vector1.length; i++) {
			if (vector1[i]/vector2[i] != factor) {
				paralelos=false;
			}
		}
			if (paralelos) {
				System.out.printf("El número es paralelo");
			} else {
				System.out.printf("El número no es paralelo");
			
			}
				}
		
			}
	
	

