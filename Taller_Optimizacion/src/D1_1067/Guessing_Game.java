package D1_1067;
import java.util.Scanner;

public class Guessing_Game {

	public static void main(String[] args) {
		// 1067 - Guessing Game
		Scanner sc = new Scanner(System.in);
		String m = "", m_aux = "";
		int n = 1, n_aux = 0;
		boolean verdad = true;
		String respuestas="";

		n = sc.nextInt();
		while (n != 0) {
			m = sc.next()+" "+sc.next();
			n_aux = n;
			m_aux = m;
			
			while (!m.equals("right on")) {
				n = sc.nextInt();
				m = sc.next()+" "+sc.next();

				if (m.equals("too high") && m_aux.equals("too low"))
					if (n - n_aux == 1)
						verdad = false;
				if (m.equals("right on") && m_aux.equals("too low"))
					if (n < n_aux)
						verdad = false;
				if (m.equals("right on") && m_aux.equals("too high"))
					if (n > n_aux)
						verdad = false;

				n_aux = n;
				m_aux = m;
			}
			if (verdad)
				respuestas+="\nStan may be honest";
			else
				respuestas+="\nStan is dishonest";
			verdad=true;
			n = sc.nextInt();
		}
		System.out.print(respuestas);
	}

}
