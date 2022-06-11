import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {


		 Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
		
		 long[] a = new long[N];
		
		 for (int i = 0; i < N; i++) {
		 a[i] = sc.nextLong() - sc.nextLong();
		
		 }

		int result = solve(a);
		System.out.println(result);

	}

	public static int solve(long[] pumps) {

		int i = 0;
		while (true) {

			while (pumps[i] < 0) {
				i = (i + 1) % pumps.length;
			}
			long temp = 0;
			int j = i - 1;
			while (temp >= 0) {
				if (i == j) {
					return i + 1;
				}
				temp += pumps[i];
				i = (i + 1) % pumps.length;
			}

		}

	}

}