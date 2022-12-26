import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int max = in.nextInt();
        int[] arr = new int[num];
        int numPages = 0;
        int curPage = 1;
        int count = 0;
        for(int i =0;i<num;i++){
            arr[i] = in.nextInt();
            for(int prob= 1;prob<=arr[i];prob++){
                int whatPage = prob/max;    
                if(prob == curPage) {
                    count++;
                }
                if(prob%max==0 && prob!=arr[i]){                    
                    curPage++;
                }               
            }      
            curPage++;
        }
        System.out.println(count);
    }
}