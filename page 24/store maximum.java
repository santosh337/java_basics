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
        int ans = 0;
        // Logic
        for (int i=0;i<n;i++) {
            // Step 1. find left max 
            int leftMax = A[i];
            for(int j=i-1;j>=0;j--) {
                leftMax = Math.max(leftMax,A[j]);
            }
            
             // Step 2. find rigth max 
            int rightMax = A[i];
            for(int j=i+1;j<n;j++) {
                rightMax = Math.max(rightMax,A[j]);
            }
            
            ans += Math.min(leftMax,rightMax) - A[i];
        }
        System.out.print(ans);
    }
}
