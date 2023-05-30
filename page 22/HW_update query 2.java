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
        
        int leftIndex = scn.nextInt();
        int rightIndex = scn.nextInt();
        int x = scn.nextInt();
        
            // left Index increase .
            for (int k =0 ;k<=leftIndex;k++) {
                System.out.print(A[k] + x +" ");
            }
            for (int k = leftIndex+1;k<=rightIndex-1;k++) {
                System.out.print(A[k] +" ");
            }
            for (int k=rightIndex;k<n;k++) {
                
                System.out.print(A[k] + x +" ");
            }
    }
}
