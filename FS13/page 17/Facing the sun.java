import java.io.*;
import java.util.*;

public class Solution {
    
    public static int facingSun(int[] arr,int n) {
        int count = 1;
        int current = arr[0];
        
        for (int i=1;i<n;i++) {
            if (arr[i] > current) {
                current = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int ans = facingSun(arr,n);
        
        System.out.println(ans);
    }
}
