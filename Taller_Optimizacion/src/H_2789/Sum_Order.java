package H_2789;

import java.util.Scanner;

public class Sum_Order {

	public static void main(String[] args) {
		// 2789 - Sum Order
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int uno=0,dos=0,tres=0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '1':
				uno++;
				break;
			case '2':
				dos++;
				break;
			case '3':
				tres++;
				break;
			}
			i++;
		}
		String salida="";
		for(int i=0;i<uno;i++) {
			salida+=1+"+";
		}
		for(int i=0;i<dos;i++) {
			salida+=2+"+";
		}
		for(int i=0;i<tres;i++) {
			salida+=3+"+";
		}
		System.out.println(salida.substring(0,salida.length()-1));
	}

}
