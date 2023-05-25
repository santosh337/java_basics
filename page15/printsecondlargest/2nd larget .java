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
    
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        
        for (int j=0;j<n;j++) {
            int ele = A[j];
            if (ele > l) {
                sl = l;
                l = ele;
            } else if (ele > sl && ele != l) {
                sl = ele;
            }
        }
        System.out.println(sl);
    }
}
