import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int c = Integer.parseInt(scan.nextLine());
        for(int i=0;i<c;i++){
            int n = Integer.parseInt(scan.nextLine());
            String[] sp = scan.nextLine().split("\\s+");
            LinkedList<Integer> ll = new LinkedList<Integer>();
            for(int j=0;j<n;j++)ll.add(Integer.parseInt(sp[j]));
            for(int j=0;j<n-2;j++){
                if(ll.get(j)!=j+1){
                    int index = findIndex(ll,j+1);
                    if((index-j)%2==0){
                        int val = ll.remove(index);
                        ll.add(j,val);
                    }
                    else{
                        int val =ll.remove(index);
                        ll.add(j,val);
                        int tmp = ll.remove(j+2);
                        ll.add(j+1,tmp);
                        
                    }
                }
            }
            String res = "YES";
            if(ll.get(n-1) != n)res = "NO";
            System.out.println(res);
        }
    }
    public static int findIndex(LinkedList<Integer> ll, int val){
        for(int i=val;i<ll.size();i++)if(ll.get(i)==val)return i;
            return -1;
    }
}