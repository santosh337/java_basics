import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] A = new int[n];
        
        for (int i=0;i<n;i++) {
            A[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();
        int[] B = new int[m];
        
        for (int i=0;i<m;i++) {
            B[i] = scn.nextInt();
        }
       
       //logic
       for (int i=0;i<n;i++) {
           int count = 0;
           for (int j=0;j<m;j++) {
               if (A[i] == B[j]) {
                   count++;
               }
           }
           if (count == 2) {
               System.out.print(A[i]+" ");
           }
       }
    }
}
