import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= in.nextInt();
        }
        System.out.println(a);
    }

}