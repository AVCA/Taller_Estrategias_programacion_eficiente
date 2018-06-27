package D8_DFS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import D8_BFS.nodo;

public class DFS {
	static int n, a;
	static int visitado[];
	static nodo nodos[];
	static int padres[];
	static int matriz[][];

	public static void main(String[] args) {
		// DFS
		try {
			FileReader fr;
			fr = new FileReader("instancias2.txt");
			Scanner sc = new Scanner(fr);
			n = sc.nextInt();
			a = sc.nextInt();

			visitado = new int[n];
			padres = new int[n];

			Stack<Integer> pila = new Stack<Integer>();
			matriz = new int[n][n]; 

			for (int i = 0; i < a; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				matriz[x][y] = 1;
				//matriz[y][x]=1;
			}

			int nodo_actual = sc.nextInt();
			pila.push(nodo_actual);
			visitado[nodo_actual] = 1;
			padres[nodo_actual] = -1;

			while (!pila.isEmpty()) {
				nodo_actual = pila.pop();
				System.out.println("-----");
				System.out.println(nodo_actual + " desde " + padres[nodo_actual]);
				for (int i = n-1; i>=0; i--) {
					if (matriz[nodo_actual][i] == 1 && visitado[i] != 1) {
						visitado[i] = 1;
						padres[i] = nodo_actual;
						pila.add(i);
					}
				}
				//System.out.println(pila);
			}

			for (int i = 0; i < n; i++) {
				System.out.print(padres[i] + " ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
