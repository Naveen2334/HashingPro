package HashingSession18;

import java.util.Scanner;

public class OAMicrosoft {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Long[] a = new Long[(int) (n + 1)];
		for (long i = 1; i <= n; i++) {
			a[(int) i] = sc.nextLong();
		}
		long x = sc.nextLong();
		long y = sc.nextLong();
		long[] pref = new long[(int) (n + 1)];
		for (long i = 1; i <= n; i++) {
			if (i - y >= 1) {
				pref[(int) i] = a[(int) i] + pref[(int) (i - y)];

			} else {
				pref[(int) i] = a[(int) i];

			}
		}
		long k = (long) 1e18;
		for (long i = 1; i <= n; i++) {
			long index = i - (x - 1) * y;
			if (index >= 1) {
				long g = pref[(int) i];
				if (index - y >= 1) {
					g = g - pref[(int) (index - y)];
				}
				k = Math.min(g, k);
				System.out.println(g);
			}
		}
		System.out.println(k);

	}

}
