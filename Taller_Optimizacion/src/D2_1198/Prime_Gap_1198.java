package D2_1198;

public class Prime_Gap_1198 {

	public static boolean esPrimo(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		int i = 5;
		while ((i * i) <= n) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
			i += 6;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 10;
		int l = n;
		int longitud = 0;
		if (!esPrimo(n)) {
			while (true) {
				l--;
				System.out.print(l + " ");
				longitud++;
				if (esPrimo(l)) {
					System.out.print("(primo)\n");
					break;
				}
			}
			l = n;
			System.out.println(l);
			while (true) {
				l++;
				System.out.print(l + " ");
				longitud++;
				if (esPrimo(l)) {
					System.out.print("(primo)\n");
					break;
				}
			}
		}
		System.out.println("Longitud: " + longitud);
	}

}
