package D9_Dijkstra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Dijkstra {
	static int aristas, nodos;
	static int D[], P[], MD[][];
	static boolean M[];
	static int x = 0, a = 0;

	public static void main(String[] args) {
		// Dijkstra
		try {
			FileReader fr = new FileReader("instancias4.txt");
			Scanner sc = new Scanner(fr);
			nodos = sc.nextInt();
			aristas = sc.nextInt();

			MD = new int[nodos][nodos];
			D = new int[nodos];
			P = new int[nodos];
			M = new boolean[nodos];
			for (int i = 0; i < nodos; i++) {
				for (int j = 0; j < nodos; j++) {
					MD[i][j] = Integer.MAX_VALUE;
				}
			}
			for (int i = 0; i < nodos; i++) {
				D[i] = Integer.MAX_VALUE;
				M[i] = false;
			}
			for (int i = 0; i < aristas; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				MD[x][y] = sc.nextInt();
			}
			x = sc.nextInt();
			D[x] = 0;
			P[x] = -1;
			a = x;
			int aux = 0;
			int marcados = 0;
			while (marcados < nodos) {
				System.out.println("------------");
				int menor = Integer.MAX_VALUE;
				for (int j = 0; j < nodos; j++) {
					if(MD[a][j]!=Integer.MAX_VALUE)
					{
						if((D[a]+MD[a][j])<D[j]) {
							D[j] = D[a]+MD[a][j];
							P[j] = a;
						}
					}
				
				}
				M[a]=true;
				marcados++;
				int min=Integer.MAX_VALUE;
				for(int i=0;i<nodos;i++) {
					if(!M[i]&&D[i]<min)
					{
						min=D[i];
						a=i;
					}
				}
			}
			imprimir();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void imprimir() {
		for (int i = 0; i < nodos; i++) {
			System.out.print(M[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < nodos; i++) {
			System.out.print(P[i] + " ");
		}
		System.out.println("\n");
	}

}
