package Apples_1622;
import java.util.Scanner;

public class Apples_1622 {

	public static void main(String[] args) {
		long tiempo_ejecucion;
		long time_start, time_end;
		time_start = System.nanoTime();
		// ========================================
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n=sc.nextInt();
			int suma=0, par=0, impar=0;
			for(int i=n;i<n;i++)
			{
				int a=sc.nextInt();
				suma+=a;
				
				if((a&1)==0)par++;
				else impar++;
			}
			if(suma%2==0) System.out.println(par);
			else System.out.println(impar);
		}
		// ========================================
		time_end = System.nanoTime();
		tiempo_ejecucion = time_end - time_start;
		System.out.println("Tiempos de ejecucion: " + (int) ((tiempo_ejecucion / 1e6) * 0.001) + "s");

	}

}
