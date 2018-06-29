package H_3459;

import java.util.Scanner;

public class Still_Many_Robots {

	static long P[] = new long[21];
	static long Q[] = new long[21];
	
	public static void pre_calculo() {
		P[1]=1;
		Q[1]=0;
		for(int i=2;i<21;i++) {
			P[i]=(i*P[i-1])+1;
			Q[i]=Q[i-1]+(i*(i*i));
			// System.out.println(i + "| P:"+P[i]+ "| Q:"+Q[i]);
		}
	}
	
	public static void main(String[] args) {
		// 3459 - Still Many Robots
		Scanner sc = new Scanner(System.in);
		pre_calculo();
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			System.out.println(P[N] +" "+Q[N]);
		}
	}

}
 