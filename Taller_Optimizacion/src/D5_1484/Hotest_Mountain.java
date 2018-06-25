package D5_1484;

import java.util.Scanner;

public class Hotest_Mountain {
	static float max = 0;
	static int p=0;

	public static void main(String[] args) {
		long tiempo_ejecucion;
		long time_start, time_end;
		time_start = System.nanoTime();
		// ========================================
		// pre_calculo();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		float n;
		for (int i = 0; i < T; i++) {
			n = sc.nextFloat();
			if (n >= max) {
				max = n;
				p=i+1;
			}
		}
		System.out.println(p);
		// ========================================
		time_end = System.nanoTime();
		tiempo_ejecucion = time_end - time_start;
		System.out.println("Tiempos de ejecucion: " + (int) ((tiempo_ejecucion / 1e6) * 0.001) + "s");
	}

}
