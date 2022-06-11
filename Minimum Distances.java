import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] == a[j]) {
                    int temp = j - i;
                    if (temp < min) {
                        min = temp;
                    }
                }
            }
        }
        if (min == Integer.MAX_VALUE)
            min = -1;
        System.out.println(min);
    }
}