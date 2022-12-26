import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int howManyGames(int p, int d, int m, int s) {
        int priceCurr = p;
        int i=0;
        while(s>=priceCurr){
            s=s-priceCurr;
            if(priceCurr>=m+d){
                priceCurr=priceCurr-d;
            }else{
                priceCurr = m;
            }
           
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}