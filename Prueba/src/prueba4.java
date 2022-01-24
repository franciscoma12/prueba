import java.util.Iterator;
import java.util.Scanner ;
import javax.imageio.metadata.IIOMetadataFormatImpl;
public class prueba4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		System.out.println("Imtroduce otro numero: ");
		int num2 = entrada.nextInt();
		
		// for while do-while
		for (int i = 0; i < num; i++) {
			for (int j=0; j<num2; j++) {
				System.out.printf("%5d-%5d\n ", i,j);
			}
		}
		System.out.println("indice múltiples");
		for (int i=0, j=num; i<num; i++, j--) {
			System.out.printf("%5d-%5d\n ", i,j);
		}
		entrada.close();
	}
	}


