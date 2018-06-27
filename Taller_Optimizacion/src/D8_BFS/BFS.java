package D8_BFS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class BFS {
	static int n,a;
	static int visitado[];
	static nodo nodos[];
	static int padres[];
	static int matriz[][];

	public static void main(String[] args) throws FileNotFoundException {
		// BFS
		FileReader fr = new FileReader("instancias.txt");
		Scanner sc = new Scanner(fr);
		n = sc.nextInt();
		a = sc.nextInt();
		
		visitado = new int[n];
		padres = new int[n];
		
		Queue<Integer> cola=new LinkedList();
		matriz = new int[n][n];
		
		for(int i=0;i<a;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			matriz[x][y]=1;
			matriz[y][x]=1;
		}
		
		int nodo_actual=sc.nextInt();
		cola.add(nodo_actual);
		visitado[nodo_actual]=1;
		padres[nodo_actual]=-1;
		
		while(!cola.isEmpty())
		{		
			nodo_actual = cola.poll();		 
			for(int i=0;i<n;i++) {
				if(matriz[nodo_actual][i]==1 && visitado[i]!=1) {
					visitado[i]=1;
					padres[i]=nodo_actual;
					cola.add(i);
				}
			}	
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(padres[i]);
		}
		
	}

}
