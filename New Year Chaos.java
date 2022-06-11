import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] nn = new int[100000];
        
        for(int t=0;t<T;t++)
        {
            int n = s.nextInt();
            
            int x, y=0;
            
            for(int j=0;j<n;j++)
            {
                nn[j] = s.nextInt();
                
                if(nn[j]-j > 3)
                {
                    y = -1;
                }
            }
            
            if(y == -1)
            {
                System.out.println("Too chaotic");
                continue;
            }
            
            int yr;
            for(int k=0;k<n;k++)
            {
                yr = y;
                for(int j=0;j<n-1;j++)
                {
                    if(nn[j] > nn[j+1])
                    {
                        x = nn[j];
                        nn[j] = nn[j+1];
                        nn[j+1] = x;
                        y++;
                    }
                }
                if(yr == y)
                    break;
            }
            
            System.out.println(y);
            
        }
    }
}