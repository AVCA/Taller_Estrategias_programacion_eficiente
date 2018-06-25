package D6_Euclides;

public class Euclides {

	public static int MCD(int a,int b) {
		if(a<b){
			a^=b;
			b^=a;
			a^=b;
		}
		while(b>0)
		{
			a^=b;
			b^=a;
			a^=b;
			b%=a;
		}
		return a;
	}
	
	public static int MCM(int a, int b) {
		return (a*b)/MCD(a,b);
	}
	
	public static void main(String[] args) {
		// Maximo comun divisor
		System.out.println(MCD(180,245));
		// Minimo comun multiplo
		System.out.println(MCD(180,245));
	}

}
