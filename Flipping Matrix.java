import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        
        
        tests:
        for(int t = 0; t < q; t ++)
        {
            int n = input.nextInt();
            
            int[][] matrix = new int[2*n][2*n];
            int sum = 0;
            
            for(int i = 0; i < matrix.length; i++)
            {
                for(int j = 0; j < matrix[0].length; j++)
                {
                    matrix[i][j] = input.nextInt();
                }
            }
            
            for(int i = 0; i < n; i++)
            {
              for(int j = 0; j < n; j++)
              {
                  int num1 = matrix[i][(2*n) - j - 1];
                  int num2 = matrix[i][j];
                  int num3 = matrix[(2*n) - i - 1][j];
                  int num4 = matrix[(2*n) - i - 1][(2*n) - j - 1];
                  sum += Math.max(num1, Math.max(num2, Math.max(num3, num4)));
              }
            }
            System.out.println(sum);
        }
    }
}