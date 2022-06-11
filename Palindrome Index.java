import java.util.*;

public class Solution {
    
    static boolean isPalidrom(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) !=  s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for (int t = 0; t < T; t++) {
            String s = in.next();
            
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    if (isPalidrom(s,i,j-1)) {
                        System.out.println(j);
                    } else {
                        System.out.println(i);
                    }
                    break;
                } 
                i ++;
                j --;
            }
            
            if (i >= j) {
                System.out.println(-1);
            }
        }
        
    }
    
    
    
}