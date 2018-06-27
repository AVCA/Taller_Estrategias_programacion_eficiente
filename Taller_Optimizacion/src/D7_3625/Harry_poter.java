package D7_3625;
import java.util.Scanner;

public class Harry_poter {
	static int fibos[] = new int[5001];
	
	public static int fibonnaci2(int n) {
		return (int) ((1.0/Math.sqrt(5))*Math.pow(((1+Math.sqrt(5))/2.0),n)+(1.0/2.0));
	}
	
	public static void pre_calculo() {
		for(int i=1;i<20;i++) {
			fibos[fibonnaci2(i)] = 1;
		}
	}
	
	public static void main(String[] args) {
		// 3625 - Harry Potter and the Stones
		pre_calculo();
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++)
		{
			int n =sc.nextInt();
			if(fibos[n]==1)
				System.out.println("Harry wins");
			else
				System.out.println("Ron wins");
		}
	}

}
