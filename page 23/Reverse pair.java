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
        
        for(int j=n-1;j>=0;j--) {
            for (int l=n-1;l>=0;l--) {
                System.out.print(A[j]+" "+A[l]);
                System.out.println();
            }
        }
        
    }
}
