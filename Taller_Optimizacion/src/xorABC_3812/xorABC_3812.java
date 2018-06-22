package xorABC_3812;

import java.util.ArrayList;
import java.util.Scanner;

public class xorABC_3812 {

	public static void main(String[] args) {
		// Tipo de solucion: Fuerza Bruta
		int A=0, B=0, C=0, n, x;
		ArrayList<Integer> L = new ArrayList<Integer>();
		n = 5;
		x = 5;
		// Generamos el contenido de la lista:
		for (int i = 0; i < n; i++) {
			L.add(i + 1);
		}
		// Generamos las permutaciones:
		for (int i = 0; i < n-2; i++) {
			// Primer valor
			A = L.get(i);
			for (int j = i + 1; j < n-1; j++) {
				// Segundo valor
				B = L.get(j);
				for (int k = j + 1; k < n; k++) {
					// Tercer valor
					C = L.get(k);
					// Calculamos el XOR de ABC
					int xor = A^B^C;
					System.out.println(A +""+ B +""+ C);
					System.out.println("XOR: "+xor);
					if(xor==x) {
						System.out.println("YES");break;
					}
					System.out.println("-------------");
				}
			}
		}
		
	}

}
