package D3_3662;

import java.util.Scanner;

public class perfect_number {

	static int perfectNumber[] = { 6, 28, 496, 8128 };
	static String divisores[] = { "6 = 1 + 2 + 3", "28 = 1 + 2 + 4 + 7 + 14",
			"48 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248",
			"8128 = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064" };

	public static void main(String[] args) {
		// Numeros perfectos:
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n != -1) {
			int i = 0;
			boolean encontrado = false;
			for (i = 0; i < 4; i++) {
				if (n == perfectNumber[i]) {
					encontrado = true;
					break;
				}
			}
			if (encontrado==true)
				System.out.println(divisores[i]);
			else
				System.out.println(n + " is NOT perfect.");
			n = sc.nextInt();
		}

	}

}
