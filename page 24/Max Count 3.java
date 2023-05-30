import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //input for A array
        int [] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
    
         int max_count = 0;
            int maxfreq = 0;
       
      //Logic implementation
      for (int i = 0; i < n; i++){
         int count = 0;
         for (int j = 0; j < n; j++){
            if (A[i] == A[j]){
               count++;
            }
         }
        
         if (count > max_count){
            max_count = count;
            maxfreq = A[i];
         }
      }
      //print the result
      System.out.print(maxfreq);
    }
}
