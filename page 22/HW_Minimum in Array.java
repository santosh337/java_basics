import java.io.*;
import java.util.*;

public class Solution {
public static int secondLargest(int [] A) {
        int temp;
        for(int i = 0; i<A.length; i++) {
            for(int j = i+1; j<A.length; j++) {
            if(A[i]>A[j]){
               temp = A[i];
               A[i] = A[j];
               A[j] = temp;
            }
         }
      }
      return A[0];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //input for A array
        int [] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
        
        int value = secondLargest(A);
        System.out.println(value);
        
    }
}
