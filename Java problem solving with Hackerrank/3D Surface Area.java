import java.util.Scanner;

public class Solution {
    private static int m;
    private static int n;
    private static int[][][] a;

    private static int surfaceArea() {
        int result = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 100; k++) {
                    if (a[i][j][k] == 0) {
                        continue;
                    }
                    if (a[i + 1][j][k] == 0) {
                        result++;
                    }
                    if (a[i - 1][j][k] == 0) {
                        result++;
                    }
                    if (a[i][j + 1][k] == 0) {
                        result++;
                    }
                    if (a[i][j - 1][k] == 0) {
                        result++;
                    }
                    if (a[i][j][k + 1] == 0) {
                        result++;
                    }
                    if (a[i][j][k - 1] == 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[m + 2][n + 2][102];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int height = sc.nextInt();
                for (int k = 1; k <= height; k++) {
                    a[i][j][k] = 1;
                }
            }
        }
        int result = surfaceArea();
        System.out.println(result);
        sc.close();
    }
}