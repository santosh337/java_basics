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
        int ans = 0;
        int mtn = arr[0];
        
        for (int j=0;j<n;j++) {
            ans = Math.max(ans,arr[j] - mtn);
            mtn = Math.min(mtn,arr[j]);
        }
        System.out.println(ans);
    }
}
