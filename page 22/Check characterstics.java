import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] A = new int[n];
        
        
        for (int i=0;i<n;i++) {
            A[i] = scn.nextInt();
        }
          
         for (int j=0;j<n;j++) {
             if (A[j] == 0) {
                 A[j] = 0;
             } else if (A[j] > 0) {
                 A[j] = 1;
             } else if (A[j] < 0) {
                 A[j] = -1;
             }
             System.out.print(A[j]+" ");
         }
         
    }
}
