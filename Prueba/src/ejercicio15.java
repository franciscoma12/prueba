import java.util.Scanner ;
public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double grados, kel, sum;
		System.out.println("Escribe grados");
		grados=sc.nextDouble();
		kel= 273.15 ;
		sum= grados + kel ;
		System.out.println(grados +" ºC = " + sum + " K");
	}

}
