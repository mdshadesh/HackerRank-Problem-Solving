import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] list = new int[M];
        for(int i = 0; i < M; i++) {
            list[i] = in.nextInt();
        }
        Arrays.sort(list);
        
        int first = Math.abs(0 - list[0]);
        int last = Math.abs((N - 1) - list[M-1]);
        int max = Math.max(first, last);
        int maxSpace = 0;
        for(int i = 0; i < M - 1; i++) {
            maxSpace = Math.max(Math.abs(list[i] - list[i+1]), maxSpace);
        }
        max = Math.max(max, maxSpace / 2);
        System.out.println(max);
    }
}
