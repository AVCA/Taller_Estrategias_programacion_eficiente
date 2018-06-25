package D1_3441;

import java.util.Scanner;

public class Watching_the_Clock {

	public static void main(String[] args) {
		// 3441 - Watching the Clock
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int M[] = new int[T];
		for(int i=0;i<T;i++)
		{
			M[i]=sc.nextInt();
		}
		for(int i=0;i<T;i++) {
			int j=0;
			while(M[i]>=2) {		
				M[i]/=2;
				j++;
			}
			System.out.println("Case #"+(i+1)+": "+j);
		}
	}
	
}
