import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String[]grid = new String[n];
            for(int i=0;i<n;i++)
                grid[i] = sort(br.readLine());
            
            boolean ok = true;
            
            for(int i=0;i<n;i++){
                for(int j=1;j<n;j++){
                    if(grid[j].charAt(i) < grid[j-1].charAt(i)){
                        ok = false;
                        break;
                    }
                }
            }
            System.out.println(ok?"YES":"NO");
            
        }
    }
    
    public static String sort(String s){
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}