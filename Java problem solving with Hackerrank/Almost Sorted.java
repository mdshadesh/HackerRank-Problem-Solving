import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int start = -1;int count = 0;int end = -1;
        int prev_i = -1;
        int size = sc.nextInt();
        int arr[] = new int [size];
        int i;
         for(int j = 0;j<size;j++){
            arr[j] = sc.nextInt();
         }
        if(findSwap(arr)==-1){
            findReverse(arr);
        }
    }
    
   static int findReverse(int [] arr){
      int start =-1;int end = -1;
       for(int i = 0;i<arr.length-1;i++){
          if(arr[i]>arr[i+1]){
               if(start==-1){
                      start = i;
                  }
                  else{
                      System.out.println("no");
                      return -1;
                  }
              while(arr[i]>arr[i+1]){                 
                  end = i+1;
                  i++;                  
              }
              if((start==0||arr[start-1]<arr[end])&&(end==arr.length-1||arr[start]<arr[end+1])){                
                      continue;
                  }
               else{
                   System.out.println("no");
                   return -1;
               }
              }
          }
        System.out.println("yes");
        System.out.println("reverse "+(start+1)+" "+(end+1));
       
       return 1;
      }
   
    
   static int findSwap(int [] arr){
        int count =0;int start = -1;int end =-1;
        for(int i = 0;i<arr.length-1;i++){
         
                   if(arr[i]>arr[i+1]){
                       count++;
                       if(count==1){
                           start = i;
                           end = i+1;
                       }
                       else{
                         if(count==2){
                             end=i+1;
                         }else{
                            return -1;
                         }
                       }
                   }                        
        }
       if((end!=arr.length-1)&&(arr[start]<arr[end+1]))
         {  
          System.out.println("yes");
          System.out.println("swap "+(start+1)+" "+(end+1));       
          return 1;
         }
       else{
           if((end==arr.length-1)&&(start==(end-1))){
                System.out.println("yes");
                System.out.println("swap "+(start+1)+" "+(end+1));       
                return 1;
           }
       }
        return -1;
    }
}