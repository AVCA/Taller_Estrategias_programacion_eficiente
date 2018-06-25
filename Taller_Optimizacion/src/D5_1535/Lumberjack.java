package D5_1535;

import java.util.Scanner;

public class Lumberjack {

	public static boolean ordenados(int N[]) {
		if (N[0] < N[N.length - 1]) {
			//System.out.println("Asc");
			for (int i = 0; i < N.length; i++) {
				if (N[i] > N[++i]) {
					return false;
				}
			}
		} else {
			//System.out.println("Des");
			for (int i = 0; i < N.length-1; i++) {
				if (N[i] < N[++i]) {
					return false;
				}
				--i;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		long tiempo_ejecucion;
		long time_start, time_end;
		time_start = System.nanoTime();
		// ========================================
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		System.out.println("Lumberjacks:");
		for (int i = 0; i < T; i++) {
			int N[] = new int[10];
			for (int j = 0; j < 10; j++) {
				N[j] = sc.nextInt();
			}
			if (ordenados(N))
				System.out.println("Ordered");
			else
				System.out.println("Unordered");
		}
		// ========================================
		time_end = System.nanoTime();
		tiempo_ejecucion = time_end - time_start;
		System.out.println("Tiempos de ejecucion: " + (int) ((tiempo_ejecucion / 1e6) * 0.001) + "s");
	}

}
