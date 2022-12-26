import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static int w, h;
    static char[][] g;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        h = in.nextInt();
        w = in.nextInt();
        g = new char[h][w];
        in.nextLine();
        for (int i = 0; i < h; i++) {
            g[i] = in.nextLine().toCharArray();
        }

        int max = 0;

        for (int len1 = Math.max(w, h); len1 > 0; len1--) {
            List<Cross> firstCrosses = findCrosses(len1);
            System.err.println(firstCrosses.size() + " cross of " + len1);

            for (Cross firstCross : firstCrosses) {
                markCross(firstCross);
                for (int len2 = len1; len2 > 0 && areaFromLen(len1) * areaFromLen(len2) > max; len2--) {
                    for (int x = 0 + len2 / 2; x < w - len2 / 2; x++) {
                        for (int y = 0 + len2 / 2; y < h - len2 / 2; y++) {
                            if (legalCross(x, y, len2)) max = Math.max(max, areaFromLen(len1) * areaFromLen(len2));
                        }
                    }
                }
                unmarkCross(firstCross);
            }
        }

        System.out.println(max);
    }

    static void markCross(Cross c) {
        for (int i = c.x - c.l / 2; i <= c.x + c.l / 2; i++) {
            g[c.y][i] = 'B';
        }
        for (int i = c.y - c.l / 2; i <= c.y + c.l / 2; i++) {
            g[i][c.x] = 'B';
        }
    }

    static void unmarkCross(Cross c) {
        for (int i = c.x - c.l / 2; i <= c.x + c.l / 2; i++) {
            g[c.y][i] = 'G';
        }
        for (int i = c.y - c.l / 2; i <= c.y + c.l / 2; i++) {
            g[i][c.x] = 'G';
        }
    }

    static int areaFromLen(int l) {
        return l + (l - 1);
    }

    static List<Cross> findCrosses(int l) {
        List<Cross> crosses = new ArrayList<>();

        for (int x = 0 + l / 2; x < w - l / 2; x++) {
            for (int y = 0 + l / 2; y < h - l / 2; y++) {
                if (legalCross(x, y, l)) crosses.add(new Cross(x, y, l));
            }
        }

        return crosses;
    }

    static boolean legalCross(int x, int y, int l) {
        for (int i = x - l / 2; i <= x + l / 2; i++) {
            if (g[y][i] != 'G') return false;
        }
        for (int i = y - l / 2; i <= y + l / 2; i++) {
            if (g[i][x] != 'G') return false;
        }
        return true;
    }

    static class Cross {
        int x, y, l;

        public Cross(int x, int y, int l) {
            this.x = x;
            this.y = y;
            this.l = l;
        }
    }

}