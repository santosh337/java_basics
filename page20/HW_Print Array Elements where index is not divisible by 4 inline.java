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
        
        for (int j=0;j<n;j++) {
            if (j%4==0) {
            } else {
                System.out.print(A[j]+" ");
            }
        }
    }
}
