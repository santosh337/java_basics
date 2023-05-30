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
        
        int k = scn.nextInt();
       
        for (int j=0;j<n;j++) {
            for (int l= 0;l<n;l++) {
                if ((arr[j] - arr[l] == k) || (arr[j] - arr[l] == (k*-1))) {
                    System.out.println(arr[j]+" "+ arr[l]);
                }
            }
        }
    }
}
