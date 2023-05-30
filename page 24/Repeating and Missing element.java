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
        int ans =0;
        int count = 1;
        for (int j=0;j<n;j++) {
            for (int k=j+1;k<n;k++) {
                if (A[j] == A[k]) {
                    ans = A[j];
                }
            }
            if (A[j] == count) {
                count++;
            }
        }
        System.out.println(ans);
        System.out.println(count);
    }
}
