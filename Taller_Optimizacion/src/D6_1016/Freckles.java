package D6_1016;

import java.util.Scanner;

public class Freckles {

	static nodo nodos[];
	static double matriz_adyacencia[][];
	static double valor_minimo=Double.MAX_VALUE;
	static double minimo=Double.MAX_VALUE;

	public static class nodo {
		double x, y;

		public nodo(double x1,double y1) {
			this.x = x1;
			this.y = y1;
		}
	}

	public static void distancia_euclidiana() {
		for (int i = 0; i < nodos.length; i++) {
			for (int j = 0; j < nodos.length; j++) {
				if(i==j) {
					matriz_adyacencia[i][j]=Double.MAX_VALUE;
				}
				else {
					matriz_adyacencia[i][j]=euclidiana(i,j);
				}
				System.out.println(i+"|"+j+":"+matriz_adyacencia[i][j]);
				if(matriz_adyacencia[i][j])
			}
		}
	}
	
	public static double euclidiana(int i, int j) {
		return Math.sqrt(Math.pow(nodos[j].x-nodos[i].x,2)+Math.pow(nodos[j].y-nodos[i].y,2));
	}

	public static void main(String[] args) {
		// 1016 - Freckles
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nodos = new nodo[n];
		matriz_adyacencia = new double[n][n];
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			nodos[i] = new nodo(x, y);
		}
		distancia_euclidiana();

	}

}
