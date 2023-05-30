import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0;i<n;i++) {
           arr[i] = scn.nextInt();
        }
        
        int carry = 1;
        
        for (int k=n-1;k>=0;k--) {
            int val = arr[k] + carry;
            if (val== 10) {
                arr[k] = 0;
            } else {
                arr[k] = val;
                carry = 0;
                break;
            }
        }
        
       if (carry == 1) {
           System.out.print(carry+" ");
       }
        
        for (int p=0;p<n;p++) {
            System.out.print(arr[p]+" ");
        }
    }
}
