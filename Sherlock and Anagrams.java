import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; ++i){
            String str = sc.next().trim();
            System.out.println(numofAnagram(str));
        }
    }
    
    public static int numofAnagram(String str){
        int total = 0;
        for(int i=1; i<str.length(); ++i){
            int[] tmpstr = new int[26];
            
            for(int j=i; j>=0; --j){
                tmpstr[str.charAt(j)-'a']++;
                
                for(int k=0; k<j; ++k){
                    int[] chars = new int[26];
                    int x = k;
                    int count =0;
                    while(count<=i-j){
                        ++chars[str.charAt(x)-'a'];
                        ++x;
                        ++count;
                    }
                    boolean flag = true;
                    for(x=0; x<26; ++x){
                        if(tmpstr[x]!=chars[x]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag) ++total;   
                }
                
            }
        }
        return total;
    }
}