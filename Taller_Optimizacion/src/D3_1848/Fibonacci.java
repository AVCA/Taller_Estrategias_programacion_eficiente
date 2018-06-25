package D3_1848;

import java.util.Scanner;

public class Fibonacci {

	// Esta funcion tarda 30s
	// Funcion recursiva:
	public static int fibonacci(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	// Esta funcion tarda 0s
	// Funcion explicita: Matematicas
	public static int fibonnaci2(int n) {
		return (int) ((1.0/Math.sqrt(5))*Math.pow(((1+Math.sqrt(5))/2.0),n)+(1.0/2.0));
	}
	
	// Funcion iterativa: Sumas
	static int fibos[] = new int[10001];
	public static void suma_fibonacci() {
		fibos[1] = 1;
		fibos[2] = 1;
		for(int i=3;i<=10000;i++) {
			fibos[i]=(fibos[i-1]+fibos[i-2])%10000;
		}
	}
	
	// Funcion precalculo:
	public static void pre_calculo() {
		for(int i=0;i<45;i++) {
			fibos[i+1] = fibonnaci2(i+1);
		}
	}

	public static void main(String[] args) {
		// Arreglo para almacenar los tiempos de ejecucion
		long tiempo_ejecucion;
		// Variables para el reloj
		long time_start, time_end;
		// -----------------------------------------
		// Inicio del conteo del tiempo de ejecucion:
		time_start = System.nanoTime();
		// Ejecuta los metodos:
		// ========================================
		suma_fibonacci();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N[] = new int[T];
		for(int i=0;i<T;i++) {
			N[i] = sc.nextInt();
		}
		for(int i=0;i<N.length;i++) {
			System.out.println(fibos[N[i]-2]+" "+fibos[N[i]-1]+" "+fibos[N[i]]);
		}
		// Fin del conteo del tiempo de ejecucion:
		time_end = System.nanoTime();
		// Almacena el tiempo de ejecucion:
		tiempo_ejecucion = time_end - time_start;
		// -----------------------------------------
		System.out.println("Tiempos de ejecucion: " + (int) ((tiempo_ejecucion / 1e6)*0.001) + "s");
	}

}
