package D1_2691;

import java.util.Scanner;

public class First_vs_Second {

	public static void main(String[] args) {
		// 2691 - First vs Second
		Scanner sc = new Scanner(System.in);
		int y1=0,y2=0;
		String line = sc.nextLine();
		String[] linea = line.trim().split("\\s+");
		int n = Integer.parseInt(linea[0]);
		int m = Integer.parseInt(linea[1]);
		line = sc.nextLine();
		linea = line.trim().split("\\s+");
		for(int i=0;i<n;i++)
		{
			y1+=Integer.parseInt(linea[i]);
		}
		line = sc.nextLine();
		linea = line.trim().split("\\s+");
		for(int i=0;i<m;i++)
		{
			y2+=Integer.parseInt(linea[i]);
		}
		if(y1==y2) {
			System.out.println("tie");
		}
		else
		{
			if(y1>y2)System.out.println("first win");
			else System.out.println("second win");
		}
	}

}
