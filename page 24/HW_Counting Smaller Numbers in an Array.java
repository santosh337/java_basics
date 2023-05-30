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
        
        for(int j=0;j<n;j++) {
            int sum = 0;
            for (int l=0;l<n;l++) {
                if (A[j] > A[l]) {
                    sum += 1;
                }
            }
            System.out.print(sum+" ");
        }
    }
}
