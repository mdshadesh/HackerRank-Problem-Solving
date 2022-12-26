import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            solve(in.nextInt(), in.nextInt());
            System.out.println();
        }
    }
    public static void solve( int n, int k) {
      if (k == 0) {
        for (int i = 1; i <= n; i++) {
          System.out.print(i + " ");
        }
        return;
      }
      if (n%2 == 1 || k > n/2) {
        System.out.print("-1");
        return;
      }
      solveAns(n,k);
    }
    static void solveAns(int n, int k) {
      boolean seen[] = new boolean[n+1];
      // 1 based indexing reminder!
      StringBuilder ans = new StringBuilder();
      for (int i = 1; i <= n; i++) {
        // try subtracting
        if ((i-k) > 0 && !seen[(i-k)]) {
          seen[(i-k)] = true;
          ans.append(i-k);
          ans.append(' ');
        } else if ((i+k) <= n && !seen[(i+k)]) {
          seen[(i+k)] = true;
          ans.append(i+k);
          ans.append(' ');
        } else {
          // impossible?
          System.out.print("-1");
          return;
        }
      }
      System.out.print(ans.toString());
    }
}