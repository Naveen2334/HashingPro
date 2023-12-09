package HashingSession16;

import java.util.Scanner;

public class Triplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int b[] = new int[n + 1];
		System.out.println("enter the array");
		for (int i = 1; i <= n; i++) {
			b[i] = sc.nextInt();
		}
		int c = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				for (int k = j + 1; k <= n; k++) {
					if (b[i] > b[j] && b[j] < b[k]) {
						c++;
					}
				}
			}
		}
		System.out.println(c);
	}

}
