import java.util.*;
import java.math.*;
import java.io.*;

public class Solution {
	
	static Scanner in = new Scanner(new BufferedInputStream(System.in));
	static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String args[]) {
		int n = in.nextInt();
		int lst = 0;
		int ans = 0;
		for(int i = 0; i < n; i ++) {
			int now = in.nextInt();
			now += lst;
			if(now % 2 != 0) {
				ans += 2;
				lst = 1;
			} else lst = 0;
		}
		if(lst == 1) out.println("NO");
		else out.println(ans);
		out.flush();
	}
	
	static class pii implements Comparable<pii> {
		int X, Y;
		public int compareTo(pii a) {
			return this.X - a.X;
		}
	}
}