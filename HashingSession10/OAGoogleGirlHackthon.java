package HashingSession10;

import java.util.Scanner;

public class OAGoogleGirlHackthon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Long[] a = new Long[(int)(n+1)];
		long k = sc.nextLong();
		long i = 1;
		while(i<=n) {
			a[(int)i]= sc.nextLong();
			i++;
		}
		long[] b = new long[200005];
		i = 1;
		while(i<=n) {
			long l = a[(int)i]-k;
			long r = a[(int)i]+k;
			b[(int)(r+1)] = b[(int)(r+1)] -1;
			i= i+1;
		}
		long answer = 1;
		i = 1;
		while(i<=200000) {
			b[(int)i] = b[(int)(i-1)] +b[(int)i];
			answer = Math.max(b[(int)i], answer);
			i= i +1;
		}
		System.out.println(answer);
	}

}
