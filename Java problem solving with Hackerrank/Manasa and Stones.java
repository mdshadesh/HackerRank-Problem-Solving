import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfTestCases = scan.nextInt();
        for (int i = 0; i < numberOfTestCases; ++i) {
            int numberOfStones = scan.nextInt() - 1;
            int a = scan.nextInt();
            int b = scan.nextInt();
            
            if (numberOfStones <= 0) {
                System.out.println(0);
            }
            else {
                Vector<Integer> results = new Vector<Integer>();
                for (int j = 0; j <= numberOfStones; ++j) {
                    results.add((numberOfStones - j) * a + j * b);
                }

                Collections.sort(results);
                System.out.print(results.elementAt(0));
                for (int j = 1; j < results.size(); ++j) {
                    if (results.elementAt(j).equals(results.elementAt(j - 1))) { continue; }
                    else { System.out.print(" " + results.elementAt(j)); }
                }
                System.out.println();
            }
        }
    }
}