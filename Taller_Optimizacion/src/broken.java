import java.util.Scanner;

public class broken {

	static char letras[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
			'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String N[] = new String[T];
		
		for (int i = 0; i < T; i++) {
			int vector[] = new int[letras.length];
			String pass = sc.next();
			for (int j = 0; j < pass.length(); j++) {
				char c = pass.charAt(j);
				vector[c-'A']=1;
			}
			int broken = vector[1]+vector[17]+vector[14]+vector[10]+vector[4]+vector[13];
			if(broken==6)System.out.println("No Secure");
			else System.out.println("Secure");
		}
	}

}
