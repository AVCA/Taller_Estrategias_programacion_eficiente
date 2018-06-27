package D7_3625;

import java.util.Scanner;

public class Harry_poter {

	public static void main(String[] args) {
		// 3625 - Harry Potter and the Stones
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		String respuesta="";
		 
		for(int i=0;i<T;i++)
		{
			double n =sc.nextInt();
			System.out.println();
			System.out.println(Math.log(n));
			if(Math.log(n)>1) {
				respuesta+="\nRon wins";
			}
			else 
			{
				respuesta+="\nHarry wins";
			}
		}
		System.out.println(respuesta);
		
	}

}
