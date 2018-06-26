package D6_1016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Freckles {

	static nodo nodos[];
	static double x[][];

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
					x[i][j]=Double.MAX_VALUE;
				}
				else {
					x[i][j]=euclidiana(i,j);
				}
			}
		}
	}
	
	public static void PRIM() {
		int n=nodos.length;
		int u[] = new int[n];
		u[0]=1;
		int nodo=0;
		int agregados=1;
		double total=0;	
		while(agregados<n){
			Double min=Double.MAX_VALUE;
			for(int i=0;i<n;i++){
				if(u[i]==1)
				{
					for(int j=0;j<n;j++){
						if(u[j]!=1 && x[i][j]<min){
							min= x[i][j];
							nodo=j;
						}
					}
				}
			}
			total+=min;
			u[nodo]=1;
			agregados++;
		}
		DecimalFormat df = new DecimalFormat("#.##");
		total = Double.valueOf(df.format(total));
		System.out.println(total);
	}
	
	public static double euclidiana(int i, int j) {
		return Math.sqrt(Math.pow(nodos[j].x-nodos[i].x,2)+Math.pow(nodos[j].y-nodos[i].y,2));
	}

	public static void main(String[] args) {
		// 1016 - Freckles
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nodos = new nodo[n];
		x = new double[n][n];
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			nodos[i] = new nodo(x, y);
		}
		distancia_euclidiana();
		PRIM();
	}

}
