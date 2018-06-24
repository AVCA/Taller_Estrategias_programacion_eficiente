package broken_Strings_1840;

import java.util.Scanner;

public class BROKEN {
	public static boolean esDigito(char c) {
		if (c < 'a' && c > 'Z')
			return true;
		else
			return false;
	}

	public static boolean isLetter(char c) {
		if (esMayuscula(c) || esMinuscula(c))
			return true;
		else
			return false;
	}

	public static boolean esMayuscula(char c) {
		if (c >= 'A' && c <= 'Z')
			return true;
		else
			return false;
	}

	public static boolean esMinuscula(char c) {
		if (c >= 'a' && c <= 'z')
			return true;
		else
			return false;
	}

	public static char Mayuscula(char c) {
		return (char) ((c - 'a') + 'A');
	}

	public static char Minuscula(char c) {
		return (char) ((c - 'A') + 'a');
	}

	public static void broken() {
		
	}

	public static void main(String[] args) {
		long tiempo_ejecucion;
		long time_start, time_end;
		time_start = System.nanoTime();
		// ========================================
		// pre_calculo();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String N[] = new String[T];
		for (int i = 0; i < T; i++) {
			String pass = sc.next();
			if (pass.length() >= 1 && pass.length() <= 100) {
				for (int j = 0; j < pass.length(); j++) {
					if (esMinuscula(pass.charAt(j)))
						Mayuscula(pass.charAt(j));
				}
				N[i] = pass;
			}
		}
		broken();
		// ========================================
		time_end = System.nanoTime();
		tiempo_ejecucion = time_end - time_start;
		System.out.println("Tiempos de ejecucion: " + (int) ((tiempo_ejecucion / 1e6) * 0.001) + "s");
	}

}
