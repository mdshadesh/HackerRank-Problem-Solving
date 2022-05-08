import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int square_count = 0;
        int test_cases = in.nextInt();
        int from;
        int to;
        int squareroot;
        for (int i = 0; i < test_cases; i++) {
            from = in.nextInt();
            to = in.nextInt();
            int a = (int)Math.ceil(Math.sqrt(from));
            int b = (int)Math.floor(Math.sqrt(to));
            square_count = b - a + 1;
            System.out.println(square_count);
        }
        
        in.close();
        
    }
    

}