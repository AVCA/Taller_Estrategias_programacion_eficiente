package D2_3811;

import java.util.Scanner;

public class xorABC {

	public static void main(String[] args) {
		int A=0, B=0, C=0;
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] linea = line.trim().split("\\s+");
		int n = Integer.parseInt(linea[0]);
		int x = Integer.parseInt(linea[1]);
		line = sc.nextLine();
		linea = line.trim().split("\\s+");
		int L[] = new int[n];
		for (int i = 0; i < n; i++) {
			L[i]=Integer.parseInt(linea[i]);
		}
		for (int i = 0; i < n-2; i++) {
			A = L[i];
			for (int j = i + 1; j < n-1; j++) {
				B = L[j];
				for (int k = j + 1; k < n; k++) {
					C = L[k];
					int xor = A^B^C;
					if(xor==x) {
						System.out.println("YES");break;
					}
					else
					{
						System.out.println("NO");
					}
				}
			}
		}
		
	}

}
