package HashingSession12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OAgoogle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		Map<Integer, Integer> kk = new HashMap<>();
		int count = 0;
		int  i =1;
		while(i<=n) {
			int RHS = a[a[a[i]]];
			int g = kk.getOrDefault(RHS, 0);
			count+=g;
			int LHS = a[a[a[i]]];
			kk.put(LHS, kk.getOrDefault(LHS, 0)+1);
			i++;
		}
		System.out.println(count);
	}

}
