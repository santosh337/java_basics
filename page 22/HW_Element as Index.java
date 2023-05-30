import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
       
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int[] res = new int[n];
        
        for (int j=0;j<n;j++) {
            int val = arr[j];
            res[j] = arr[val];
        }
        
        for (int k=0;k<n;k++) {
            System.out.print(res[k]+" ");
        }
    }
}
