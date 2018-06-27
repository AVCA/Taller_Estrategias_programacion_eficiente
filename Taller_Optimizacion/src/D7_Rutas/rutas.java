package D7_Rutas;

import java.util.Scanner;

public class rutas {
	// Variables para el arbol:
	static nodo nodos[];
	static double x[][];
	// Variables pata el problema
	static double c=0;
	static double c_aux=0;
	static int camiones=0;
	// Variables para Greddy
	static int n=0;
	static int u[];
	static int nodo=0, nodo_aux=0;
	static int agregados=1;
	static double total=0;
	
	public static double euclidiana(int i, int j) {
		return Math.sqrt(Math.pow(nodos[j].x-nodos[i].x,2)+Math.pow(nodos[j].y-nodos[i].y,2));
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
				//System.out.println(i+"|"+j+":"+x[i][j]);
			}
		}
	}
	
	public static void Greddy() {
		u[0]=1;
		System.out.println("Camiones: "+camiones);
		System.out.println(c);
		n=nodos.length;
		while(agregados<n){
			nodo=0;
			Double min=Double.MAX_VALUE;
			for(int i=0;i<n;i++){
				if(i!=nodo && u[i]!=1 &&  x[nodo][i]<=min)
				{
					min= x[nodo][i];
					nodo_aux=i;
				}
			}
			
			if(c - nodos[nodo].valor >=0) {
				nodo = nodo_aux;
				u[nodo]=1;
				agregados++;
				c = c - nodos[nodo].valor;
				System.out.println(nodos[nodo].toString());
			}	
			else
			{
				camiones++;
				nodo=0;
				//Greddy();
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		c = sc.nextInt();
		c_aux=c;
		// Arreglo que contendra los nodos obtenidos
		nodos = new nodo[n];
		n=nodos.length;
		// Matriz de adyacencia
		x = new double[n][n];
		// Almancenamos las coordenadas de los nodos
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			nodos[i] = new nodo(x, y,0,"");
		}
		// Almacenamos los valores de cada nodo
		for(int i=0;i<n;i++) {
			nodos[i].valor=sc.nextDouble();
		}
		nodos[0].setEtiqueta("ALMACEN");
		nodos[1].setEtiqueta("A");
		nodos[2].setEtiqueta("B");
		nodos[3].setEtiqueta("C");
		nodos[4].setEtiqueta("D");
		nodos[5].setEtiqueta("E");
		nodos[6].setEtiqueta("F");
		camiones++;
		distancia_euclidiana();
		u = new int[n];
		Greddy();
	}
	
}
