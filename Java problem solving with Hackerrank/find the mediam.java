import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            br.readLine();
            String[] strArr = br.readLine().split(" ");
            if (strArr == null || strArr.length == 0) {
                return;
            }
            int[] intArr = strArrToIntArr(strArr);
            Arrays.sort(intArr);
            System.out.println(intArr[intArr.length / 2]);
        } catch (IOException e) {
            
        }
    }
    
    public static int[] strArrToIntArr(String[] strArr){
        if(strArr == null || strArr.length <= 0){ return null; }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}