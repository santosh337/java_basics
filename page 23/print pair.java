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
    
        for (int j = 0;j<n;j++) {
            for (int l = j+1;l< n;l++) {
                System.out.print(A[j]+" "+A[l]);
                System.out.println();
            }
        }
    }
}
