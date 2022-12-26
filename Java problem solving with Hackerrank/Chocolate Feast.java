import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        scanner.nextLine();
        while (scanner.hasNext()) {
            int money = scanner.nextInt();
            int price = scanner.nextInt();
            int bonus = scanner.nextInt();
            
            int count = money / price;
            int wrappers = count;
            
            while (wrappers >= bonus) {
                int freebies = wrappers / bonus;
                count += freebies;
                wrappers = freebies + wrappers % bonus;
            }
            
            System.out.println(count);
        }
    }
}
