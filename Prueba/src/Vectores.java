//Vectores
import java.util.Scanner;
public class Vectores {
	
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
	}

	public static void  pedir_vector(float v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextFloat();
		}
	}
	
	public static void  mostrar_vector(float v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%2.f ", v[i]);
		}
	}


	public static void  mostrar_vector_m(int v[], int num) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
	}
	
	public static void  mostrar_vector_m(float v[], float num) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
	}
	
	public static int num_aciertos (int ganadora[], int apuesta[] ) {
		int aciertos= 0;
		for (int i=0; i<apuesta.length; i++) {
			for  (int j=0; j<ganadora.length; j++) {
				if (apuesta[i]==ganadora[j]) {
					aciertos++;
				}
			}
		
		}
		return aciertos;
	}
	
	
	}



