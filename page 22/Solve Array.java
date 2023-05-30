import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
       
        for (int i=0;i<n;i++) {
            arr1[i] = scn.nextInt();
        }
        
        int[] arr2 = new int[n];
       
       int[] ans = new int[n];
        for (int i=0;i<n;i++) {
            arr2[i] = scn.nextInt();
        }
        
        for (int j=0;j<n;j++) {
            ans[arr2[j]] = arr1[j];
        }
        for (int l=0;l< n ;l++) {
            System.out.print(ans[l]+" ");
        }
    }
}
