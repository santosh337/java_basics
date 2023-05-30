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
        
        for (int k=0;k<n;k++) {
            for (int p=0;p<m;p++) {
                if (A[k] + B[p] == 0) {
                    System.out.print(A[k]+" ");
                }
            }
        }
    }
}
