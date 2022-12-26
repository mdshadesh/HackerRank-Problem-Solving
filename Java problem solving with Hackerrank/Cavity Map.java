import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[][] array = new int[n][n];
        int[][] target = new int[n][n];
        for(int i=0; i<n; i++){
        	String line = in.nextLine();
        	char[] data = line.toCharArray();
            for(int j=0; j<n; j++){
                array[i][j] = Character.getNumericValue(data[j]);
                //System.out.println(array[i][j]);
            }
        }
        cavityMap(array, target);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(target[i][j] == -1)
                    System.out.print("X");
                else
                    System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void cavityMap(int[][] array, int[][] target) {
        int row = array.length;
        int col = array[0].length;
        for(int i=1; i<row-1; i++){
            for(int j=1; j<col-1; j++){
                if(isMaximum(array, i, j)){
                    target[i][j] = -1; // will be translate to X later
                }
            }
        }
    }
    
    public static boolean isMaximum(int[][] array, int i, int j) {
        int max = Math.max(Math.max(array[i-1][j], array[i+1][j]), Math.max(array[i][j-1], array[i][j+1]));
        if(max >= array[i][j])
            return false;
        else
            return true;
    }
}