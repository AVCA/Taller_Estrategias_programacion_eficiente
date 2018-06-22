package Cuantos_Primos_dividen_3274;

import java.util.Scanner;

public class Many_Primes {
	static int pre_calculo[];
	static int primos[];

	public static void pre_calculo() {
		primos();
		pre_calculo = new int[1001];
		int N[] = new int[1001];
		for (int i = 0; i < pre_calculo.length - 2; i++) {
			N[i] = i + 2;
		}
		for (int k = 0; k < N.length - 2; k++) {
			int j = 0;
			for (int i = 0; i < primos.length; i++) {
				if (primos[i] <= N[k]) {
					if (N[k] % primos[i] == 0) {
						j++;
					}
				}
			}
			pre_calculo[k] = j;
		}

	}

	public static void primos() {
		int j = 0;
		primos = new int[168];
		for (int i = 2; i < 1000; i++) {
			if (esPrimo(i)) {
				primos[j] = i;
				j++;
			}
		}
	}

	public static boolean esPrimo(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		int i = 5;
		while ((i * i) <= n) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
			i += 6;
		}
		return true;
	}

	public static void main(String[] args) {
		// Problema 1198

		pre_calculo();

		Scanner sc = new Scanner(System.in);
		System.out.print("Valor de t:");
		int t = sc.nextInt();
		int N[] = new int[t];
		System.out.print("Valores de N:\n");
		for (int i = 0; i < t; i++) {
			N[i] = sc.nextInt();
		}
		System.out.println("---------");

		for (int i = 0; i < t; i++) {
			System.out.println(N[i]);
			System.out.println(pre_calculo[i]);
			System.out.println("---------");
		}

	}

}